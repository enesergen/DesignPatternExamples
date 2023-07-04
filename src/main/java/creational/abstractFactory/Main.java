package creational.abstractFactory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.javatpoint.com/abstract-factory-pattern
//https://www.javatpoint.com/images/designpattern/abstractfactory.jpg
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Name of Bank:");
        String bankName=br.readLine();
        System.out.println("\n");
        System.out.println("Enter the loan name e.g. Home, Education, Business:");
        String loanName=br.readLine();

        AbstractFactory bankFactory=FactoryCreator.abstractFactory("Bank");
        Bank b= bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for "+b.getBankName()+":");
        double rate=Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.print("Enter the loan amount you want to take: ");
        double loanAmount=Double.parseDouble(br.readLine());

        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(br.readLine());
        System.out.print("\n");

        AbstractFactory loanFactory=FactoryCreator.abstractFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);

    }
}
