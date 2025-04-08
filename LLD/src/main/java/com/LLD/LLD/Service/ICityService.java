package com.LLD.LLD.Service;

import com.LLD.LLD.Model.City;

import java.util.List;

public interface ICityService {
    City addCity(City city);
    City updateCity(Integer cityID, City city);
    void deleteCity(Integer cityID);
    City getCity(Integer cityID);
    List<City> getCities();
}
