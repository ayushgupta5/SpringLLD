package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.Booking;
import com.LLD.LLD.Service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private IBookingService bookingService;
    @PostMapping("/save")
    public ResponseEntity<?> addBooking(@RequestBody Booking booking) {
        Booking newBooking = bookingService.addBooking(booking);
        return new ResponseEntity<>(newBooking, HttpStatus.CREATED);
    }

    // READ - GET by ID
    @GetMapping("/get/{bookingID}")
    public ResponseEntity<?> getBookingById(@PathVariable Integer bookingID) {
        Booking booking = bookingService.getBooking(bookingID);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

    // READ - GET by ID
    @GetMapping("/get")
    public ResponseEntity<?> getBookings() {
        List<Booking> bookings = bookingService.getBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    // UPDATE - PUT
    @PutMapping("/update/{bookingID}")
    public ResponseEntity<?> updateBooking(@PathVariable Integer bookingID, @RequestBody Booking updatedBooking) {
        Booking booking = bookingService.updateBooking(bookingID, updatedBooking);
        return new ResponseEntity<>(booking, HttpStatus.FOUND);
    }

    // DELETE - DELETE
    @DeleteMapping("/delete/{bookingID}")
    public ResponseEntity<?> deleteBooking(@PathVariable Integer bookingID) {
        bookingService.deleteBooking(bookingID);
        return new ResponseEntity<>("Booking Deleted Successfully", HttpStatus.OK);
    }
}
