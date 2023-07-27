package creational.builder.coldDrink;

import creational.builder.Item.Item;

public interface ColdDrink extends Item {
    @Override
    String name();

    @Override
    String size();

    @Override
    float price();
}
