package creational.builder.pizza.vegPizza.masala;

public class MediumMasalaPizza extends MasalaPizza {
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public float price() {
        return 185;
    }
}
