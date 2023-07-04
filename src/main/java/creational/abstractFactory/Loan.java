package creational.abstractFactory;

public abstract class Loan {//credit mortgage
    protected double rate;
    abstract void getInterestRate(double rate);//
    public void calculateLoanPayment(double loanAmount,int years){
        double EMI;
        int n;
        n=years*12;
        rate=rate/1200;
        EMI=(rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1)*loanAmount;
        System.out.println("Your Monthly EMI is:"+EMI+" for the amount "+loanAmount+" .You have borrowed");
    }

}

class HomeLoan extends Loan{

    @Override
    void getInterestRate(double rate) {
        super.rate=rate;
    }

}
class BusinessLoan extends Loan{

    @Override
    void getInterestRate(double rate) {
        super.rate=rate;
    }
}
class EducationLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        super.rate=rate;
    }
}