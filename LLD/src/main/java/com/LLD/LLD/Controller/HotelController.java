package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.Hotel;
import com.LLD.LLD.Service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private IHotelService hotelService;

    @PostMapping("/save")
    public ResponseEntity<?> addHotel(@RequestBody Hotel hotel) {
        Hotel newHotel = hotelService.addHotel(hotel);
        return new ResponseEntity<>(newHotel, HttpStatus.CREATED);
    }

    @GetMapping("/get/{hotelID}")
    public ResponseEntity<?> getHotelByID(@PathVariable Integer hotelID) {
        Hotel hotel = hotelService.getHotel(hotelID);
        return new ResponseEntity<>(hotel, HttpStatus.FOUND);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getHotels() {
        List<Hotel> hotels = hotelService.getHotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @PutMapping("/update/{hotelID}")
    public ResponseEntity<?> updateHotel(@PathVariable Integer hotelID, @RequestBody Hotel updatedHotel) {
        Hotel hotel = hotelService.updateHotel(hotelID, updatedHotel);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{hotelID}")
    public ResponseEntity<?> deleteHotel(@PathVariable Integer hotelID) {
        hotelService.deleteHotel(hotelID);
        return new ResponseEntity<>("Hotel Deleted Successfully", HttpStatus.OK);
    }
}

