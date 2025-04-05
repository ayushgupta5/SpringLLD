package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Booking;

import java.util.List;

public interface IBookingService {
    Booking addBooking(Booking booking);
    Booking updateBooking(Integer bookingID, Booking booking);
    void deleteBooking(Integer bookingID);
    Booking getBooking(Integer bookingID);
    List<Booking> getBookings();
}
