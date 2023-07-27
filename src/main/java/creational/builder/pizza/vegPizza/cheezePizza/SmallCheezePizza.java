package creational.builder.pizza.vegPizza.cheezePizza;

public class SmallCheezePizza extends CheezePizza {
    @Override
    public String name() {
        return "Cheeze Pizza";
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
