package creational.builder.coldDrink.pepsi;

public class MediumPepsi implements Pepsi{
    @Override
    public String name() {
        return "Pepsi Cold Drink";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public float price() {
        return 40;
    }
}
