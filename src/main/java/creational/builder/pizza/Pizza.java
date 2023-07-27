package creational.builder.pizza;

import creational.builder.Item.Item;

public abstract class Pizza implements Item {
    @Override
    public abstract float price();
}
