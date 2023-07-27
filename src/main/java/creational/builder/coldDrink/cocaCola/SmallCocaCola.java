package creational.builder.coldDrink.cocaCola;

public class SmallCocaCola implements CocaCola {
    @Override
    public String name() {
        return "Coca Cola Cold Drink";
    }

    @Override
    public String size() {
        return "Small";
    }

    @Override
    public float price() {
        return 30;
    }
}
