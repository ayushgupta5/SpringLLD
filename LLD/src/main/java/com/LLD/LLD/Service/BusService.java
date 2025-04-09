package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Bus;
import com.LLD.LLD.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IBusService {
    @Autowired
    private BusRepository busRepository;
    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public Bus updateBus(Integer busID, Bus bus) {
        Bus busObject = busRepository.findById(busID).get();
        busObject.setBusName(bus.getBusName());
        busObject.setBusType(bus.getBusType());
        busObject.setArrivalTime(bus.getArrivalTime());
        busObject.setDepartureTime(bus.getDepartureTime());
        busObject.setDriverName(bus.getDriverName());
        return busRepository.save(busObject);
    }

    @Override
    public void deleteBus(Integer busID) {
        busRepository.deleteById(busID);
    }

    @Override
    public Bus getBus(Integer busID) {
        return busRepository.findById(busID).get();
    }

    @Override
    public List<Bus> getBuses() {
        return busRepository.findAll();
    }
}
