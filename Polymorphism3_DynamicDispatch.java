// Polymorphism Program 3: One array, many object types, each behaves differently
public class Polymorphism3_DynamicDispatch {

    static class Shape {
        public double area() {
            return 0;
        }

        public String name() {
            return "Shape";
        }
    }

    static class Circle extends Shape {
        private double r;

        public Circle(double r) {
            this.r = r;
        }

        public double area() {
            return Math.PI * r * r;
        }

        public String name() {
            return "Circle";
        }
    }

    static class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        public double area() {
            return side * side;
        }

        public String name() {
            return "Square";
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(2), new Square(4), new Circle(1.5) };
        double total = 0;
        // same call, correct method chosen at runtime
        for (Shape s : shapes) {
            System.out.println(s.name() + " area = " + s.area());
            total += s.area();
        }
        System.out.println("Total area = " + total);
    }
}
