window.FoodTruck = Backbone.Model.extend({
	urlRoot: "foodtrucks/rest/foodtruckmethods/",
	defaults: {
		"foodTruckId": "",
	    "locationid":  "",
	    "Applicant":  "",
	    "FacilityType":  "",
	    "LocationDescription":  "",
	    "Address":"",
	    "FoodItems":"",
	    "X":"",
	    "Y":"",
	    "Latitude":"",
	    "Longitude":"",
	    "Schedule":"",
	    "Location":"",
	  }
});

window.FoodTruckCollection = Backbone.Collection.extend({
	model: FoodTruck,
	url: "foodtrucks/rest/foodtruckmethods/"
});