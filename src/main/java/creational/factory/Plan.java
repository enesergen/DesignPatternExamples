package creational.factory;

public abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(rate * units);
    }

}

class DomesticPlan extends Plan {

    @Override
    void getRate() {
        rate = 3.5;
    }
}

class CommercialPlan extends Plan {
    @Override
    void getRate() {
        rate = 5.5;
    }
}

class InstutionalPlan extends Plan {
    @Override
    void getRate() {
        rate = 7.5;
    }
}

class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstutionalPlan();
        }

        return null;
    }
}
