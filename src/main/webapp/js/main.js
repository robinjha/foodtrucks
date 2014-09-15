Backbone.View.prototype.close = function () {
    console.log('Closing view ' + this);
    if (this.beforeClose) {
        this.beforeClose();
    }
    this.remove();
    this.unbind();
};

var AppRouter = Backbone.Router.extend({

    initialize: function() {
        $('#header').html( new HeaderView().render().el );
    },

	routes: {
		""			: "list",
		"foodtruck/new"	: "newFoodTruck",
		"foodtruck/:id"	: "foodtruckDetails"
	},

	list: function() {
        this.before();
  	},

	foodtruckDetails: function(id) {
        this.before(function() {
			var foodtruck = app.foodtruckList.get(id);
		    app.showView( '#content', new FoodTruckView({model: foodtruck}) );
        });
  	},

	newFoodTruck: function() {
        this.before(function() {
    		app.showView( '#content', new FoodTruckView({model: new FoodTruck()}) );
        });
	},

    showView: function(selector, view) {
        if (this.currentView)
            this.currentView.close();
        $(selector).html(view.render().el);
        this.currentView = view;
        return view;
    },

    before: function(callback) {
        if (this.foodtruckList) {
            if (callback) callback();
        } else {
            this.foodtruckList = new FoodTruckCollection();
       		this.foodtruckList.fetch({success: function() {
               $('#sidebar').html( new FoodTruckListView({model: app.foodtruckList}).render().el );
               if (callback) callback();
            }});
        }
    }

});

tpl.loadTemplates(['header', 'foodtruck-details', 'foodtruck-list-item'], function() {
    app = new AppRouter();
    Backbone.history.start();
});