package creational.builder.pizza.vegPizza.cheezePizza;

import creational.builder.pizza.vegPizza.VegPizza;

public abstract class CheezePizza extends VegPizza {

    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract float price();
}
