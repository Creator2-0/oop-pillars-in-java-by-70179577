// Abstraction Program 1: Abstract class with abstract and normal methods
public class Abstraction1_AbstractClass {

    static abstract class Shape {
        protected String name;

        public Shape(String name) {
            this.name = name;
        }

        // abstract: no body, child classes MUST implement
        public abstract double area();

        public abstract double perimeter();

        // normal method shared by all children
        public void describe() {
            System.out.println(name + " -> area: " + area() + ", perimeter: " + perimeter());
        }
    }

    static class Rectangle extends Shape {
        private double w, h;

        public Rectangle(double w, double h) {
            super("Rectangle");
            this.w = w;
            this.h = h;
        }

        public double area() {
            return w * h;
        }

        public double perimeter() {
            return 2 * (w + h);
        }
    }

    static class Circle extends Shape {
        private double r;

        public Circle(double r) {
            super("Circle");
            this.r = r;
        }

        public double area() {
            return Math.PI * r * r;
        }

        public double perimeter() {
            return 2 * Math.PI * r;
        }
    }

    public static void main(String[] args) {
        // Shape s = new Shape("x");  // not allowed, abstract class
        Shape s1 = new Rectangle(4, 6);
        Shape s2 = new Circle(3);
        s1.describe();
        s2.describe();
    }
}
