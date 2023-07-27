package creational.builder.pizza.vegPizza;

import creational.builder.pizza.Pizza;

public abstract class VegPizza extends Pizza {

    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public float price() {
        return 0;
    }
}
