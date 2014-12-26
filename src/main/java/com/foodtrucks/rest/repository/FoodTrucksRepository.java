package com.foodtrucks.rest.repository;

import java.util.List;

import com.foodtrucks.rest.domain.FoodTruck;

public interface FoodTrucksRepository {
	
	public List<FoodTruck> findAllFoodTrucks();
	public List<FoodTruck> findByName(String name);
	public FoodTruck findById(long id);
	public void create(FoodTruck foodtruck);
	public void update(FoodTruck foodtruck);
	public void delete(FoodTruck foodtruck);
	public void createPersonCollection();
	public void dropPersonCollection();
	public List<FoodTruck> findAllFoodTrucksNearLocationWithFoodOptions(long latitude, long longitude);
}

