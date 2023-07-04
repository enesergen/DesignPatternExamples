package creational.abstractFactory;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}

class BankFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bank) {
        if(bank==null){
            return null;
        }

        if(bank.equalsIgnoreCase("ZIRAAT")){
            return new Ziraat();
        } else if (bank.equalsIgnoreCase("DENIZ")) {
            return new Deniz();
        } else if (bank.equalsIgnoreCase("HALK")) {
            return new Halk();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}

class LoanFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan==null){
            return null;
        }
        if(loan.equalsIgnoreCase("HOME")){
            return new HomeLoan();
        }else if(loan.equalsIgnoreCase("EDUCATION")){
            return new EducationLoan();
        } else if (loan.equalsIgnoreCase("BUSINESS")) {
            return new BusinessLoan();
        }

        return null;
    }
}