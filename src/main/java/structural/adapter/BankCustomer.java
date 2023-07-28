package structural.adapter;

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetail() {
        //read data part

        setBankName("HSBC");
        setAccNumber(2415841);
        setAccHolderName("ACC-1");
    }

    @Override
    public String getCreditCard() {
        return getBankName() + " " + getAccHolderName() + " " + getAccNumber();
    }
}
