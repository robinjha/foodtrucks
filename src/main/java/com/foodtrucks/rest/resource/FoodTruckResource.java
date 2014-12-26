package com.foodtrucks.rest.resource;

import java.util.List;

import com.foodtrucks.rest.domain.FoodTruck;

public interface FoodTruckResource {
	
	public List<FoodTruck> findAllFoodTrucks();
	public List<FoodTruck> findByName(String query);
	public List<FoodTruck> findAllFoodTrucksNearLocationWithFoodOptions(long latitude, long longitude);
	public FoodTruck create(FoodTruck FoodTruck);
	public FoodTruck update(FoodTruck FoodTruck);
	public FoodTruck delete(FoodTruck FoodTruck);

}
