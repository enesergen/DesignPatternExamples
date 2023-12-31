package creational.prototype;

public class EmployeeRecord implements Prototype {
    int id;
    String name;
    String designation;
    double salary;
    String address;

    EmployeeRecord() {
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord() {
        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);

    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id,name,designation,salary,address);
    }


}
