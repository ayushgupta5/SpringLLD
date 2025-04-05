package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Booking;
import com.LLD.LLD.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookingService implements IBookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Override
    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(Integer bookingID, Booking booking) {
        Booking bookingObject = bookingRepository.findById(bookingID).get();

        bookingObject.setCheckInDate(booking.getCheckInDate());
        bookingObject.setCheckOutDate(booking.getCheckOutDate());
        bookingObject.setStatus(booking.getStatus());
        bookingObject.setTotalPrice(booking.getTotalPrice());
        return bookingRepository.save(bookingObject);
    }

    @Override
    public void deleteBooking(Integer bookingID) {
        bookingRepository.deleteById(bookingID);
    }

    @Override
    public Booking getBooking(Integer bookingID) {
        return bookingRepository.findById(bookingID).get();
    }

    @Override
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }
}
