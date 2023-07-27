package creational.builder.coldDrink.cocaCola;

public class LargeCocaCola implements CocaCola{
    @Override
    public String name() {
        return "Coca Cola Cold Drink";
    }

    @Override
    public String size() {
        return "Large";
    }

    @Override
    public float price() {
        return 70;
    }
}
