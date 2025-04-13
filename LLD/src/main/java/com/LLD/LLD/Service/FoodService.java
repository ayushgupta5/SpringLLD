package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Food;
import com.LLD.LLD.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService implements IFoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Override
    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food updateFood(Integer foodID, Food food) {
        Food foodObject = foodRepository.findById(foodID).get();

        foodObject.setFoodPrice(food.getFoodPrice());
        foodObject.setFoodName(food.getFoodName());
        foodObject.setFoodRating(food.getFoodRating());
        return foodRepository.save(foodObject);
    }

    @Override
    public void deleteFood(Integer foodID) {
        foodRepository.deleteById(foodID);
    }

    @Override
    public Food getFoodByID(Integer foodID) {
        return foodRepository.findById(foodID).get();
    }

    @Override
    public List<Food> getFoods() {
        return foodRepository.findAll();
    }
}
