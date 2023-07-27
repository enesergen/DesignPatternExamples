package creational.builder.pizza.vegPizza.onionPizza;

public class LargeOnionPizza extends OnionPizza {
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Large";
    }

    @Override
    public float price() {
        return 165;
    }
}
