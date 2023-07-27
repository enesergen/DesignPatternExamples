package creational.builder.pizza.vegPizza.onionPizza;

public class SmallOnionPizza  extends OnionPizza{
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Small";
    }

    @Override
    public float price() {
        return 80;
    }
}
