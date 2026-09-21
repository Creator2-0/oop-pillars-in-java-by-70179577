// Inheritance Program 4: Multiple inheritance using interfaces
// (Java does not allow extending two classes, but allows many interfaces)
public class Inheritance4_MultipleInterfaces {

    interface Flyable {
        void fly();
    }

    interface Swimmable {
        void swim();
    }

    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public void breathe() {
            System.out.println(name + " is breathing");
        }
    }

    // Duck inherits from one class and two interfaces
    static class Duck extends Animal implements Flyable, Swimmable {
        public Duck(String name) {
            super(name);
        }

        public void fly() {
            System.out.println(name + " is flying");
        }

        public void swim() {
            System.out.println(name + " is swimming");
        }
    }

    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        d.breathe();
        d.fly();
        d.swim();
    }
}
