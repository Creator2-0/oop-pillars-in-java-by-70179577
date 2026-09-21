// Encapsulation Program 3: Employee with validated salary and read-only id
public class Encapsulation3_Employee {

    static class Employee {
        private final int id;       // no setter, so read-only
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            setSalary(salary);      // reuse validation
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            }
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            } else {
                System.out.println("Salary cannot be negative");
            }
        }

        public void giveRaise(double percent) {
            salary = salary + (salary * percent / 100);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "Usman", 50000);
        System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
        e.setSalary(-100);   // rejected
        e.giveRaise(10);
        System.out.println("After raise: " + e.getSalary());
    }
}
