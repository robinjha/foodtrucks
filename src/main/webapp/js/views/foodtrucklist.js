window.FoodTruckListView = Backbone.View.extend({

    tagName:'ul',

    initialize:function () {
        this.model.bind("reset", this.render, this);
        var self = this;
        this.model.bind("add", function (foodtruck) {
            $(self.el).append(new FoodTruckListItemView({model:foodtruck}).render().el);
        });
    },

    render:function (eventName) {
        _.each(this.model.models, function (foodtruck) {
            $(this.el).append(new FoodTruckListItemView({model:foodtruck}).render().el);
        }, this);
        return this;
    }
});

window.FoodTruckListItemView = Backbone.View.extend({

    tagName:"li",

    initialize:function () {
        this.template = _.template(tpl.get('foodtruck-list-item'));
        this.model.bind("change", this.render, this);
        this.model.bind("destroy", this.close, this);
    },

    render:function (eventName) {
        $(this.el).html(this.template(this.model.toJSON()));
        return this;
    }

});