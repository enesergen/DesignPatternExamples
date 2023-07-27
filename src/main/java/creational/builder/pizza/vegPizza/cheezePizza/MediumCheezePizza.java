package creational.builder.pizza.vegPizza.cheezePizza;

public class MediumCheezePizza extends CheezePizza {
    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public float price() {
        return 150;
    }
}
