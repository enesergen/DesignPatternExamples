package creational.factory;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        int units = 4;

        Plan p = planFactory.getPlan("domesticplan");
        System.out.println(p.getClass()+" Plan. "+ "Bill Amount:");
        p.getRate();
        p.calculateBill(units);

        Plan p1= planFactory.getPlan("commercialplan");
        System.out.println(p1.getClass()+" Plan. "+ "Bill Amount:");
        p1.getRate();
        p1.calculateBill(units);

        Plan p2= planFactory.getPlan("institutionalplan");
        System.out.println(p2.getClass()+" Plan. "+ "Bill Amount:");
        p2.getRate();
        p2.calculateBill(units);


    }
}
