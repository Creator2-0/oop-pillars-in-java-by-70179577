// Polymorphism Program 2: Runtime polymorphism (method overriding)
public class Polymorphism2_MethodOverriding {

    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }

        public void move() {
            System.out.println("Animal moves");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }

        @Override
        public void move() {
            System.out.println("Cat sneaks quietly");
        }
    }

    public static void main(String[] args) {
        // parent reference, child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();   // Dog version runs
        a1.move();    // not overridden, parent version runs
        a2.sound();   // Cat version runs
        a2.move();    // Cat version runs
    }
}
