package com.foodtrucks.rest.service;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.foodtrucks.rest.domain.FoodTruck;
import com.foodtrucks.rest.repository.FoodTrucksRepository;

@Service
@Scope("singleton")

public class FoodTruckServiceImpl implements FoodTruckService{
	
	static final Logger logger = LoggerFactory.getLogger(FoodTruckServiceImpl.class);

    @Autowired private FoodTrucksRepository foodTruckRepository;
    
 
    public List<FoodTruck> findAllFoodTrucks() {
     List<FoodTruck> results = foodTruckRepository.findAllFoodTrucks();

        logger.info("Total amount of FoodTrucks: {}", results.size());
        logger.info("Results: {}", results);
        
        return results;
    }
    
    public List<FoodTruck> findByName(String name) {
     List<FoodTruck> results = foodTruckRepository.findByName(name);
        return results;
    }
    
    public FoodTruck findById(long id) {
     return foodTruckRepository.findById(id);
    }

	public void create(FoodTruck FoodTruck) {
		// TODO Auto-generated method stub
		
	}

	public void update(FoodTruck FoodTruck) {
		// TODO Auto-generated method stub
		
	}

	public void delete(FoodTruck FoodTruck) {
		// TODO Auto-generated method stub
		
	}

	public int getAvarageAgeOfFoodTruck() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void createFoodTruckCollection() {
		// TODO Auto-generated method stub
		
	}

	public void dropFoodTruckCollection() {
		// TODO Auto-generated method stub
		
	} 
	

}
