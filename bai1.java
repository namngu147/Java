package bttuan9;

public class bai1 {
    

    public interface IEmployee {
        int calculateSalary();
        String getName();
    }

    static abstract class Employee implements IEmployee {
        protected String name;
        protected int paymentPerHour;

        public Employee(String name, int paymentPerHour) {
            this.name = name;
            this.paymentPerHour = paymentPerHour;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPaymentPerHour(int paymentPerHour) {
            this.paymentPerHour = paymentPerHour;
        }

        public int getPaymentPerHour() {
            return paymentPerHour;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    static public class PartTimeEmployee extends Employee {
        int workingHours;

        public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
            super(name, paymentPerHour);
            this.workingHours = workingHours;
        }

        @Override
        public int calculateSalary() {
            return paymentPerHour * workingHours;
        }
    }

    static public class FullTimeEmployee extends Employee {
        private static final int WORKING_HOURS = 5 * 7; // Total working hours in a week

        public FullTimeEmployee(String name, int paymentPerHour) {
            super(name, paymentPerHour);
        }

        @Override
        public int calculateSalary() {
            return paymentPerHour * WORKING_HOURS;
        }
    
    }
    public static void main(String[] args) {
        PartTimeEmployee employee1 = new PartTimeEmployee("Chi pheo", 10, 40);
        int s1 = employee1.calculateSalary();
        System.out.println("Luong cua " + employee1.getName() + " = " + s1);

        FullTimeEmployee employee2 = new FullTimeEmployee("Thi No", 20);
        int s2 = employee2.calculateSalary();
        System.out.println("Luong cua " + employee2.getName() + " = " + s2);
        
    }
}