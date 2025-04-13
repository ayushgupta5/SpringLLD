package com.LLD.LLD.Repository;

import com.LLD.LLD.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Integer> {
}
