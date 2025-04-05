package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Hotel;
import com.LLD.LLD.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IHotelService{
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(Integer hotelID, Hotel hotel) {
        Hotel hotelObject = hotelRepository.findById(hotelID).get();
        hotelObject.setDescription(hotel.getDescription());
        return hotelRepository.save(hotelObject);
    }

    @Override
    public void deleteHotel(Integer hotelID) {
        hotelRepository.deleteById(hotelID);
    }

    @Override
    public Hotel getHotel(Integer hotelID) {
        return hotelRepository.findById(hotelID).get();
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }
}
