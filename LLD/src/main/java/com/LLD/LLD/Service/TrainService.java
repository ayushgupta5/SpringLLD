package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Train;
import com.LLD.LLD.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService implements ITrainService {
    @Autowired
    private TrainRepository trainRepository;
    @Override
    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }

    @Override
    public Train updateTrain(Integer trainID, Train train) {
        Train trainObject = trainRepository.findById(trainID).get();
        trainObject.setTrainName(train.getTrainName());
        trainObject.setTrainType(train.getTrainType());
        trainObject.setArrivalTime(train.getArrivalTime());
        trainObject.setDepartureTime(train.getDepartureTime());

        return trainRepository.save(trainObject);
    }

    @Override
    public void deleteTrain(Integer trainID) {
        trainRepository.deleteById(trainID);
    }

    @Override
    public Train getTrain(Integer trainID) {
        return trainRepository.findById(trainID).get();
    }

    @Override
    public List<Train> getTrains() {
        return trainRepository.findAll();
    }
}
