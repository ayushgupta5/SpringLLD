package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Food;

import java.util.List;

public interface IFoodService {
    Food addFood(Food food);
    Food updateFood(Integer foodID, Food food);
    void deleteFood(Integer foodID);
    Food getFoodByID(Integer foodID);
    List<Food> getFoods();
}
