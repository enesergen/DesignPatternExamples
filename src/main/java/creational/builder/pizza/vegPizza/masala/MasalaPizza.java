package creational.builder.pizza.vegPizza.masala;

import creational.builder.pizza.vegPizza.VegPizza;

public abstract class MasalaPizza extends VegPizza {
    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract float price();
}
