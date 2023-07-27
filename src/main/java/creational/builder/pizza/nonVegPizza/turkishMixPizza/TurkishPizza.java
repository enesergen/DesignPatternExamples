package creational.builder.pizza.nonVegPizza.turkishMixPizza;

import creational.builder.pizza.nonVegPizza.NonVegPizza;

public abstract class TurkishPizza extends NonVegPizza {
    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract float price();
}
