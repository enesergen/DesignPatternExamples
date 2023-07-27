package creational.builder.coldDrink.cocaCola;

import creational.builder.coldDrink.ColdDrink;

public interface CocaCola extends ColdDrink {
    @Override
    String name();

    @Override
    String size();

    @Override
    float price();
}
