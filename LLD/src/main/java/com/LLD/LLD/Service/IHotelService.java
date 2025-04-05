package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Hotel;

import java.util.List;


public interface IHotelService {
    Hotel addHotel(Hotel hotel);
    Hotel updateHotel(Integer hotelID, Hotel hotel);
    void deleteHotel(Integer hotelID);
    Hotel getHotel(Integer hotelID);
    List<Hotel> getHotels();
}
