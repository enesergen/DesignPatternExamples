package creational.builder.order;

import creational.builder.coldDrink.ColdDrink;
import creational.builder.coldDrink.pepsi.MediumPepsi;
import creational.builder.pizza.Pizza;
import creational.builder.pizza.vegPizza.cheezePizza.CheezePizza;
import creational.builder.pizza.vegPizza.cheezePizza.SmallCheezePizza;

public class OrderBuilder {
    public OrderedItems prepareOrder() {
        OrderedItems orderedItems = new OrderedItems();
        Pizza pizza = new SmallCheezePizza();
        orderedItems.addItems(pizza);
        ColdDrink coldDrink = new MediumPepsi();
        orderedItems.addItems(coldDrink);
        return orderedItems;
    }
}
