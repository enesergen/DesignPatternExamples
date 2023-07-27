package creational.builder.pizza.vegPizza.onionPizza;

import creational.builder.pizza.vegPizza.VegPizza;

public abstract class OnionPizza extends VegPizza {
    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract float price();
}
