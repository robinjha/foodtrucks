window.FoodTruck = Backbone.Model.extend({
	urlRoot: "foodtrucks/rest/foodtruckmethods/",
	defaults: {
		"id": null,
	    "name":  "",
	    "fooditems":  "",
	    "address":  "",
	    "location":  "",
	  }
});

window.FoodTruckCollection = Backbone.Collection.extend({
	model: FoodTruck,
	url: "foodtrucks/rest/foodtruckmethods/"
});