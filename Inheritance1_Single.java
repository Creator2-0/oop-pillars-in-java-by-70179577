// Inheritance Program 1: Single inheritance (Animal -> Dog)
public class Inheritance1_Single {

    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println(name + " is eating");
        }

        public void sleep() {
            System.out.println(name + " is sleeping");
        }
    }

    // Dog gets eat() and sleep() from Animal
    static class Dog extends Animal {
        public Dog(String name) {
            super(name);   // call parent constructor
        }

        public void bark() {
            System.out.println(name + " says Woof!");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.eat();     // inherited
        d.sleep();   // inherited
        d.bark();    // own method
    }
}
