package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.Train;
import com.LLD.LLD.Service.ITrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {
    @Autowired
    private ITrainService trainService;
    @PostMapping("/save")
    public ResponseEntity<?> addTrain(@RequestBody Train train) {
        Train newTrain = trainService.addTrain(train);
        return new ResponseEntity<>(newTrain, HttpStatus.CREATED);
    }
    @GetMapping("/get/{trainID}")
    public ResponseEntity<?> getTrainByID(@PathVariable Integer trainID) {
        Train train = trainService.getTrain(trainID);
        return new ResponseEntity<>(train, HttpStatus.FOUND);
    }
    @GetMapping("/get")
    public ResponseEntity<?> getTrains() {
        List<Train> trains = trainService.getTrains();
        return new ResponseEntity<>(trains, HttpStatus.OK);
    }
    @PutMapping("/update/{trainID}")
    public ResponseEntity<?> updateTrain(@PathVariable Integer trainID, @RequestBody Train updatedTrain) {
        Train train = trainService.updateTrain(trainID, updatedTrain);
        return new ResponseEntity<>(train, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{trainID}")
    public ResponseEntity<?> deleteTrain(@PathVariable Integer trainID) {
        trainService.deleteTrain(trainID);
        return new ResponseEntity<>("Train Deleted Successfully", HttpStatus.OK);
    }
}
