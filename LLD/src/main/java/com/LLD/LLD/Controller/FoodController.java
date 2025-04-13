package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.Food;
import com.LLD.LLD.Service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private IFoodService foodService;
    @PostMapping("/save")
    public ResponseEntity<?> addFood(@RequestBody Food food) {
        Food newFood = foodService.addFood(food);
        return new ResponseEntity<>(newFood, HttpStatus.CREATED);
    }

    @GetMapping("/get/{foodID}")
    public ResponseEntity<?> getFoodByID(@PathVariable Integer foodID) {
        Food food = foodService.getFoodByID(foodID);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getFoods() {
        List<Food> foods = foodService.getFoods();
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @PutMapping("/update/{foodID}")
    public ResponseEntity<?> updateFood(@PathVariable Integer foodID, @RequestBody Food updatedFood) {
        Food food = foodService.updateFood(foodID, updatedFood);
        return new ResponseEntity<>(food, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{foodID}")
    public ResponseEntity<?> deleteFood(@PathVariable Integer foodID) {
        foodService.deleteFood(foodID);
        return new ResponseEntity<>("Food Deleted Successfully", HttpStatus.OK);
    }
}
