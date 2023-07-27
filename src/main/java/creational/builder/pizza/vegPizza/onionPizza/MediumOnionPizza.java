package creational.builder.pizza.vegPizza.onionPizza;

public class MediumOnionPizza extends OnionPizza{
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public float price() {
        return 115;
    }
}
