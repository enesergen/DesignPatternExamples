package creational.builder.pizza.nonVegPizza.turkishMixPizza;

public class LargeTurkishMixPizza extends TurkishPizza{
    @Override
    public String name() {
        return "Turkish Pizza";
    }

    @Override
    public String size() {
        return "Large";
    }

    @Override
    public float price() {
        return 250;
    }
}
