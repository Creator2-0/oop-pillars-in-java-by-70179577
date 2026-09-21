// Encapsulation Program 1: Student class with private data
public class Encapsulation1_Student {

    static class Student {
        // private fields - cannot be accessed directly from outside
        private String name;
        private int age;
        private double gpa;

        // constructor sets initial values
        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        // getters give read access
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGpa() {
            return gpa;
        }

        // setter with validation
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age");
            }
        }

        public void setGpa(double gpa) {
            if (gpa >= 0.0 && gpa <= 4.0) {
                this.gpa = gpa;
            } else {
                System.out.println("Invalid GPA");
            }
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Awais", 21, 3.2);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getGpa());
        s.setAge(-5);   // rejected by validation
        s.setGpa(3.6);  // accepted
        System.out.println("Updated GPA: " + s.getGpa());
    }
}
