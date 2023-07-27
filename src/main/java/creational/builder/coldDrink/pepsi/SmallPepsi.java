package creational.builder.coldDrink.pepsi;

public class SmallPepsi implements Pepsi{
    @Override
    public String name() {
        return "Pepsi Cold Drink";
    }

    @Override
    public String size() {
        return "Small";
    }

    @Override
    public float price() {
        return 20;
    }
}
