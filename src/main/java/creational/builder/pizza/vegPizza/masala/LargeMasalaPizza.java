package creational.builder.pizza.vegPizza.masala;

public class LargeMasalaPizza extends MasalaPizza{
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Large";
    }

    @Override
    public float price() {
        return 240;
    }
}
