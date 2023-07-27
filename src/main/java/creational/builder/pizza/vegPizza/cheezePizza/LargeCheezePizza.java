package creational.builder.pizza.vegPizza.cheezePizza;

public class LargeCheezePizza extends CheezePizza {
    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
        return "Large";
    }

    @Override
    public float price() {
        return 200;
    }
}
