package creational.abstractFactory;

public class FactoryCreator {
    public static AbstractFactory abstractFactory(String choice) {
        if (choice.equalsIgnoreCase("BANK")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("LOAN")) {
            return new LoanFactory();
        }
        return null;
    }
}
