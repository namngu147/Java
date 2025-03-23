package bttuan9;

public interface IEmployee {
    int calculateSalary();
    String getName();
}


public class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return this.paymentPerHour;
    }

    // A default implementation; you might want to override this in subclasses.
    @Override
    public int calculateSalary() {
        return 0;
    }
}


public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        // Salary is calculated as payment per hour multiplied by the number of working hours.
        return getPaymentPerHour() * workingHours;
    }
}


public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        // Assuming full-time employees work a fixed number of hours per month, for example, 160 hours.
        return getPaymentPerHour() * 160;
    }
}


public class test {
    public static void main(String[] args) {
        // Create and test a full-time employee.
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 20);
        System.out.println(fullTimeEmp.getName() + "'s monthly salary: " + fullTimeEmp.calculateSalary());

        // Create and test a part-time employee.
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 15, 80); // for example, 80 working hours
        System.out.println(partTimeEmp.getName() + "'s salary: " + partTimeEmp.calculateSalary());
    }
}