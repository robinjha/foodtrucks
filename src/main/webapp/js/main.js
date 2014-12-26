/*// Models
window.FoodTruck = Backbone.Model.extend({
	initialize: function(){
		console.log("Object is created");
	}
});


window.FoodTruckCollection = Backbone.Collection.extend({
    model:FoodTruck,
    url:"../foodtrucks/rest/foodtruckmethods",
});


// Views
window.FoodTruckListView = Backbone.View.extend({

    tagName:'ul',

    initialize:function () {
        this.model.bind("reset", this.render, this);
    },

    render:function (eventName) {
        _.each(this.model.models, function (foodtruck) {
            $(this.el).append(new WineListItemView({model:foodtruck}).render().el);
        }, this);
        return this;
    }

});

window.FoodTruckListItemView = Backbone.View.extend({

    tagName:"li",

    template:_.template($('#tpl-foodtruck-list-item').html()),

    render:function (eventName) {
        $(this.el).html(this.template(this.model.toJSON()));
        return this;
    }

});

window.FoodTruckView = Backbone.View.extend({

    template:_.template($('#tpl-foodtruck-details').html()),

    render:function (eventName) {
        $(this.el).html(this.template(this.model.toJSON()));
        return this;
    }

});


// Router
var AppRouter = Backbone.Router.extend({

    initialize: function() {
        $('#header').html( new HeaderView().render().el );
    },

	routes: {
		""			: "list"
	},

	list: function() {
        this.before();
  	},

	foodtruckDetails: function(id) {
        this.before(function() {
			var wine = app.foodtruckList.get(id);
		    app.showView( '#content', new FoodTruckView({model: wine}) );
        });
  	},

	newFoodTruck: function() {
        this.before(function() {
    		app.showView( '#content', new FoodTruckView({model: new FoodTruck()}) );
        });
	}
});

var AppRouter = Backbone.Router.extend({
	 
    routes:{
        "":"list",
    },
 
    list:function () {
        this.foodtruckList = new FoodTruckCollection();
        this.foodtruckListView = new FoodTruckListView({model:this.foodtruckList});
        this.foodtruckList.fetch({reset: true});
        $('#sidebar').html(this.foodtruckListView.render().el);
    },
 
    foodtruckDetails:function (id) {
        this.foodtruck = this.foodtruckList.get(id);
        this.foodtruckView = new FoodTruckView({model:this.foodtruck});
        $('#content').html(this.foodtruckView.render().el);
    }
});


var app = new AppRouter();
Backbone.history.start();*/