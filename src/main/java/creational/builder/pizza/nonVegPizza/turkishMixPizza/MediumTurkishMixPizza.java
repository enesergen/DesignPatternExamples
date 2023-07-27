package creational.builder.pizza.nonVegPizza.turkishMixPizza;

public class MediumTurkishMixPizza  extends TurkishPizza{
    @Override
    public String name() {
        return "Turkish Pizza";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public float price() {
        return 130;
    }
}
