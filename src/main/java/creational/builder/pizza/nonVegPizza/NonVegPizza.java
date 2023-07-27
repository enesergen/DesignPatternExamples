package creational.builder.pizza.nonVegPizza;

import creational.builder.pizza.Pizza;

public abstract class NonVegPizza extends Pizza {
    @Override
    public abstract String name();

    @Override
    public abstract String size();
    @Override
    public abstract float price();
}
