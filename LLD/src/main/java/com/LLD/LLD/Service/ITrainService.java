package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Train;

import java.util.List;

public interface ITrainService {
    Train addTrain(Train train);

    Train updateTrain(Integer trainID, Train train);

    void deleteTrain(Integer trainID);

    Train getTrain(Integer trainID);

    List<Train> getTrains();
}
