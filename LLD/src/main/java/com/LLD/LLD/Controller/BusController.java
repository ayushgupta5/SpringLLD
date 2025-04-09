package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.Booking;
import com.LLD.LLD.Model.Bus;
import com.LLD.LLD.Service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private IBusService busService;

    @PostMapping("/save")
    public ResponseEntity<?> addBus(@RequestBody Bus bus) {
        Bus newBus = busService.addBus(bus);
        return new ResponseEntity<>(newBus, HttpStatus.CREATED);
    }

    @GetMapping("/get/{busID}")
    public ResponseEntity<?> getBusById(@PathVariable Integer busID) {
        Bus bus = busService.getBus(busID);
        return new ResponseEntity<>(bus, HttpStatus.FOUND);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getBuses() {
        List<Bus> buses = busService.getBuses();
        return new ResponseEntity<>(buses, HttpStatus.OK);
    }

    @PutMapping("/update/{busID}")
    public ResponseEntity<?> updateBus(@PathVariable Integer busID, @RequestBody Bus updatedBus) {
        Bus bus = busService.updateBus(busID, updatedBus);
        return new ResponseEntity<>(bus, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{busID}")
    public ResponseEntity<?> deleteBus(@PathVariable Integer busID) {
        busService.deleteBus(busID);
        return new ResponseEntity<>("Bus Deleted Successfully", HttpStatus.OK);
    }

}
