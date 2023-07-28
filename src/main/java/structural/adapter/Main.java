package structural.adapter;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard=new BankCustomer();
        creditCard.giveBankDetail();
        System.out.println(creditCard.getCreditCard());
    }
}
