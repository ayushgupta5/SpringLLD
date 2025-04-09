package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.City;
import com.LLD.LLD.Service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService cityService;
    @PostMapping("/save")
    public ResponseEntity<?> addCity(@RequestBody City city) {
        City newCity = cityService.addCity(city);
        return new ResponseEntity<>(newCity, HttpStatus.CREATED);
    }

    @GetMapping("/get/{cityID}")
    public ResponseEntity<?> getCityByID(@PathVariable Integer cityID) {
        City city = cityService.getCity(cityID);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getCities() {
        List<City> cities = cityService.getCities();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @PutMapping("/update/{cityID}")
    public ResponseEntity<?> updateCity(@PathVariable Integer cityID, @RequestBody City updateCity) {
        City city = cityService.updateCity(cityID, updateCity);
        return new ResponseEntity<>(city, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{cityID}")
    public ResponseEntity<?> deleteCity(@PathVariable Integer cityID) {
        cityService.deleteCity(cityID);
        return new ResponseEntity<>("City Deleted Successfully", HttpStatus.OK);
    }
}
