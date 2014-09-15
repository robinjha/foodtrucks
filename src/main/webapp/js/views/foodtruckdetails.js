window.WineView = Backbone.View.extend({

    tagName: "div", // Not required since 'div' is the default if no el or tagName specified

    initialize: function() {
        this.template = _.template(tpl.get('foodtruck-details'));
		this.model.bind("change", this.render, this);
    },

    render: function(eventName) {
		$(this.el).html(this.template(this.model.toJSON()));
		return this;
    },

    events: {
        "change input": "change",
		"click .save": "saveFoodTruck",
		"click .delete": "deleteFoodTruck"
    },

    change: function(event) {
        var target = event.target;
        console.log('changing ' + target.id + ' from: ' + target.defaultValue + ' to: ' + target.value);
		// You could change your model on the spot, like this:
        // var change = {};
        // change[target.name] = target.value;
        // this.model.set(change);
    },

	saveFoodTruck: function() {
		this.model.set({
			name: $('#name').val(),
			grapes: $('#fooditems').val(),
			country: $('#address').val(),
			region: $('#location').val(),
		});
		if (this.model.isNew()) {
			var self = this;
			app.wineList.create(this.model, {
				success: function() {
					app.navigate('foodtruckmethods/'+self.model.id, false);
				}
			});
		} else {
			this.model.save();
		}

		return false;
	},

	deleteFoodTruck: function() {
		this.model.destroy({
			success: function() {
				alert('Food Truck deleted successfully');
				window.history.back();
			}
		});
		return false;
	}

});