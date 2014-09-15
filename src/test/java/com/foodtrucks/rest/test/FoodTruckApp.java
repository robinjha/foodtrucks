package com.foodtrucks.rest.test;

import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.foodtrucks.rest.domain.FoodTruck;
import com.foodtrucks.rest.service.FoodTruckService;
import com.foodtrucks.rest.service.FoodTruckServiceImpl;
import com.mongodb.MongoException;



public class FoodTruckApp {
	
	static final Logger logger = LoggerFactory.getLogger(FoodTruckApp.class);

    public static void main( String[] args ) throws UnknownHostException, MongoException {
		logger.info("Bootstrapping MongoDemo application");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		FoodTruckService personService = (FoodTruckService)context.getBean(FoodTruckServiceImpl.class);

        /*// cleanup person collection before insertion
		personService.dropPersonCollection();

        //create person collection
		personService.createPersonCollection();

        //for(int i=0; i<20; i++) {
		personService.create(new Person("Mike", 35));
		personService.update(new Person("Tom", 30, "New Jersey"));
		personService.update(new Person("Tommy", 30, "New York"));
        //}
		
		List<Person> results = personService.findAllPersons();
		for(Person person:results){
			List<Person> results1 = personService.findByName(person.getName());
			for(Person person1:results1){
				Person person2 = personService.findById(person1.getPersonId());
				person2.getName();
			}
		}
        logger.info("Avarage age of a person is: {}", personService.getAvarageAgeOfPerson());

        logger.info("Finished MongoDemo application");
	}*/
		int count = 0;
		List<FoodTruck> results = personService.findAllFoodTrucks();//personService.findByName("Truck");
		for(FoodTruck person:results){
			logger.info("Person : " +person);
			count++;
		}
		logger.info("Count" + count);
        logger.info("Finished MongoDemo application");
    }

}


