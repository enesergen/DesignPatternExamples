package creational.abstractFactory;
public interface Bank {
    String getBankName();

}
class Ziraat implements Bank{
    private final String BANK_NAME;

    Ziraat(){
        BANK_NAME="ZIRAAT BANK";
    }
    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}

class Deniz implements Bank{
    private final String BANK_NAME;
    Deniz(){
        BANK_NAME="DENIZ BANK";
    }
    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}

class Halk implements Bank{
    private final String BANK_NAME;
    Halk(){
        BANK_NAME="HALK BANK";
    }
    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}



