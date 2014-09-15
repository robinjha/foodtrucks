window.HeaderView = Backbone.View.extend({

    initialize: function() {
        this.template = _.template(tpl.get('header'));
    },

    render: function(eventName) {
		$(this.el).html(this.template());
		return this;
    },

    events: {
		"click .new"    : "newFoodTruck"
    },

	newFoodTruck: function(event) {
		app.navigate("foodtrucks/rest/foodtruckmethods/new", true);
		return false;
	}

});