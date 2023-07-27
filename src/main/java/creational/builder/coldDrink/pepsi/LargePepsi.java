package creational.builder.coldDrink.pepsi;

public class LargePepsi implements Pepsi{
    @Override
    public String name() {
        return "Pepsi Cold Drink";
    }

    @Override
    public String size() {
        return "Large";
    }

    @Override
    public float price() {
        return 55;
    }
}
