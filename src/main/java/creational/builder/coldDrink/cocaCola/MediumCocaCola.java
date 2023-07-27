package creational.builder.coldDrink.cocaCola;

public class MediumCocaCola implements CocaCola {
    @Override
    public String name() {
        return "Coca Cola Cold Drink";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public float price() {
        return 55;
    }
}
