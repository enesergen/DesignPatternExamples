package creational.builder.coldDrink.pepsi;

import creational.builder.coldDrink.ColdDrink;

public interface Pepsi extends ColdDrink {
    @Override
    String name();

    @Override
    String size();

    @Override
    float price();
}
