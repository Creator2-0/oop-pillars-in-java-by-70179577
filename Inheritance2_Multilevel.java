// Inheritance Program 2: Multilevel inheritance (Person -> Student -> GraduateStudent)
public class Inheritance2_Multilevel {

    static class Person {
        protected String name;

        public Person(String name) {
            this.name = name;
        }

        public void introduce() {
            System.out.println("Hi, I am " + name);
        }
    }

    static class Student extends Person {
        protected String university;

        public Student(String name, String university) {
            super(name);
            this.university = university;
        }

        public void study() {
            System.out.println(name + " studies at " + university);
        }
    }

    // third level: inherits from Student, which inherits from Person
    static class GraduateStudent extends Student {
        private String thesis;

        public GraduateStudent(String name, String university, String thesis) {
            super(name, university);
            this.thesis = thesis;
        }

        public void research() {
            System.out.println(name + " is researching: " + thesis);
        }
    }

    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("Sara", "NUST", "Machine Learning");
        g.introduce();   // from Person
        g.study();       // from Student
        g.research();    // own method
    }
}
