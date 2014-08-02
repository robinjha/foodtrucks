package com.foodtrucks.rest.service;

import java.util.List;

import com.foodtrucks.rest.domain.FoodTruck;

public interface FoodTruckService {
	
	public List<FoodTruck> findAllFoodTrucks();
	public List<FoodTruck> findByName(String query);
	public FoodTruck findById(long id);
	public void create(FoodTruck FoodTruck);
	public void update(FoodTruck FoodTruck);
	public void delete(FoodTruck FoodTruck);
	public int getAvarageAgeOfFoodTruck();
	public void createFoodTruckCollection();
	public void dropFoodTruckCollection();
}

