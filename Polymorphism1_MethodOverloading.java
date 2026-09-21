// Polymorphism Program 1: Compile-time polymorphism (method overloading)
public class Polymorphism1_MethodOverloading {

    static class Calculator {
        // same method name, different parameter lists
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public String add(String a, String b) {
            return a + " " + b;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // compiler picks the right version by looking at arguments
        System.out.println("int + int: " + calc.add(5, 10));
        System.out.println("int + int + int: " + calc.add(1, 2, 3));
        System.out.println("double + double: " + calc.add(2.5, 3.5));
        System.out.println("String + String: " + calc.add("Hello", "World"));
    }
}
