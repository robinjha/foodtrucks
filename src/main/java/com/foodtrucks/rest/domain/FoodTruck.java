package com.foodtrucks.rest.domain;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A simple POJO representing a FoodTruck
 */
@Document(collection = "foodtrucks")
@XmlRootElement//(name = "FoodTruck")
public class FoodTruck {

	
	@Id
	private String foodTruckId;
	private int locationid;
	private String Applicant;
	private String FacilityType;
	private int cnn;
	private String LocationDescription;
	private String Address;
//	private int blocklot;
//	private int block;
//	private int lot;
//	private String permit;
//	private String Status;
	private String FoodItems;
	private Double X;
	private Double Y;
	private Double Latitude;
	private Double Longitude;
	private String Schedule;
	private String NOISent;
	private String Approved;
	private String Received;
	private int PriorPermit;
	private String ExpirationDate;
	private String Location;
	
	public FoodTruck() {
		super();
	}
	
	public FoodTruck(String foodTruckId, int locationid, String applicant,
			String facilityType, int cnn, String locationDescription,
			String address, int blocklot, int block, int lot, String permit,
			String status, String foodItems, Double x, Double y,
			Double latitude, Double longitude, String schedule, String nOISent,
			String approved, String received, int priorPermit,
			String expirationDate, String location) {
		super();
		this.foodTruckId = foodTruckId;
		this.locationid = locationid;
		Applicant = applicant;
		FacilityType = facilityType;
		this.cnn = cnn;
		LocationDescription = locationDescription;
		Address = address;
//		this.blocklot = blocklot;
//		this.block = block;
//		this.lot = lot;
//		this.permit = permit;
//		Status = status;
		FoodItems = foodItems;
		X = x;
		Y = y;
		Latitude = latitude;
		Longitude = longitude;
		Schedule = schedule;
		NOISent = nOISent;
		Approved = approved;
		Received = received;
		PriorPermit = priorPermit;
		ExpirationDate = expirationDate;
		Location = location;
	}
	
	
	public String getFoodTruckId() {
		return foodTruckId;
	}
	public void setFoodTruckId(String foodTruckId) {
		this.foodTruckId = foodTruckId;
	}
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public String getApplicant() {
		return Applicant;
	}
	public void setApplicant(String applicant) {
		Applicant = applicant;
	}
	public String getFacilityType() {
		return FacilityType;
	}
	public void setFacilityType(String facilityType) {
		FacilityType = facilityType;
	}
	public String getLocationDescription() {
		return LocationDescription;
	}
	public void setLocationDescription(String locationDescription) {
		LocationDescription = locationDescription;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getFoodItems() {
		return FoodItems;
	}
	public void setFoodItems(String foodItems) {
		FoodItems = foodItems;
	}
	public Double getX() {
		return X;
	}
	public void setX(Double x) {
		X = x;
	}
	public Double getY() {
		return Y;
	}
	public void setY(Double y) {
		Y = y;
	}
	public Double getLatitude() {
		return Latitude;
	}
	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}
	public Double getLongitude() {
		return Longitude;
	}
	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}
	public String getSchedule() {
		return Schedule;
	}
	public void setSchedule(String schedule) {
		Schedule = schedule;
	}
	public String getApproved() {
		return Approved;
	}
	public void setApproved(String approved) {
		Approved = approved;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "FoodTruck [foodTruckId=" + foodTruckId + ", locationid="
				+ locationid + ", Applicant=" + Applicant + ", FacilityType="
				+ FacilityType + ", cnn=" + cnn + ", LocationDescription="
				+ LocationDescription + ", Address=" + Address +" FoodItems=" + FoodItems
				+ ", X=" + X + ", Y=" + Y + ", Latitude=" + Latitude
				+ ", Longitude=" + Longitude + ", Schedule=" + Schedule
				+ ", NOISent=" + NOISent + ", Approved=" + Approved
				+ ", Received=" + Received + ", PriorPermit=" + PriorPermit
				+ ", ExpirationDate=" + ExpirationDate + ", Location="
				+ Location + "]";
	}
}