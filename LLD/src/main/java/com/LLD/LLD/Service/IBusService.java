package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Bus;

import java.util.List;

public interface IBusService {
    Bus addBus(Bus bus);

    Bus updateBus(Integer busID, Bus bus);

    void deleteBus(Integer busID);

    Bus getBus(Integer busID);

    List<Bus> getBuses();
}
