package com.foodtrucks.rest.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.foodtrucks.rest.domain.FoodTruck;

@Repository
@Scope("singleton")

public class FoodTruckRepositoryImpl implements FoodTrucksRepository{
	
	static final Logger logger = LoggerFactory.getLogger(FoodTruckRepositoryImpl.class);
	
	 @Autowired MongoTemplate mongoTemplate;

	 
	 public List<FoodTruck> findAllFoodTrucks() {
		 logger.info("Entered into findAllPersons");
		 return mongoTemplate.findAll(FoodTruck.class);
	 }

	public List<FoodTruck> findByName(String name) {
		logger.info("Entered into findbyname");
		return mongoTemplate.find(new Query(Criteria.where("FacilityType").is(name)), FoodTruck.class);
	}

	public FoodTruck findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(FoodTruck foodtruck) {
		// TODO Auto-generated method stub
		
	}

	public void update(FoodTruck foodtruck) {
		// TODO Auto-generated method stub
		
	}

	public void delete(FoodTruck foodtruck) {
		// TODO Auto-generated method stub
		
	}

	public void createPersonCollection() {
		// TODO Auto-generated method stub
		
	}

	public void dropPersonCollection() {
		// TODO Auto-generated method stub
		
	}
	
	

}
