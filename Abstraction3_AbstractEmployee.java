// Abstraction Program 3: Abstract Employee, each type calculates salary differently
public class Abstraction3_AbstractEmployee {

    static abstract class Employee {
        protected String name;

        public Employee(String name) {
            this.name = name;
        }

        // every employee type must define its own salary logic
        public abstract double calculateSalary();

        public void printSlip() {
            System.out.println("Employee: " + name + " | Salary: " + calculateSalary());
        }
    }

    static class FullTimeEmployee extends Employee {
        private double monthlySalary;

        public FullTimeEmployee(String name, double monthlySalary) {
            super(name);
            this.monthlySalary = monthlySalary;
        }

        public double calculateSalary() {
            return monthlySalary;
        }
    }

    static class PartTimeEmployee extends Employee {
        private double hourlyRate;
        private int hoursWorked;

        public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
            super(name);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        public double calculateSalary() {
            return hourlyRate * hoursWorked;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Hamza", 80000);
        Employee e2 = new PartTimeEmployee("Bilal", 500, 60);
        e1.printSlip();
        e2.printSlip();
    }
}
