package creational.builder.pizza.nonVegPizza.turkishMixPizza;

public class SmallTurkishMixPizza  extends TurkishPizza{
    @Override
    public String name() {
        return "Turkish Pizza";
    }

    @Override
    public String size() {
        return "Small";
    }

    @Override
    public float price() {
        return 100;
    }
}
