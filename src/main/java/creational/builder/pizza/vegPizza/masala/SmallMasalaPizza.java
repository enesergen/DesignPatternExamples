package creational.builder.pizza.vegPizza.masala;

public class SmallMasalaPizza extends MasalaPizza {
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Small";
    }

    @Override
    public float price() {
        return 170;
    }
}
