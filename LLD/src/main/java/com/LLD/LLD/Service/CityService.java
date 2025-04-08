package com.LLD.LLD.Service;

import com.LLD.LLD.Model.City;
import com.LLD.LLD.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public City addCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City updateCity(Integer cityID, City city) {
        City cityObject = cityRepository.findById(cityID).get();

        cityObject.setCityName(city.getCityName());
        cityObject.setState(city.getState());
        cityObject.setCityPinCode(city.getCityPinCode());

        return cityRepository.save(cityObject);
    }

    @Override
    public void deleteCity(Integer cityID) {
        cityRepository.deleteById(cityID);
    }

    @Override
    public City getCity(Integer cityID) {
        return cityRepository.findById(cityID).get();
    }

    @Override
    public List<City> getCities() {
        return cityRepository.findAll();
    }
}
