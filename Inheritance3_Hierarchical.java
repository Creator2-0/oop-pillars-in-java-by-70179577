// Inheritance Program 3: Hierarchical inheritance (one parent, many children)
public class Inheritance3_Hierarchical {

    static class Shape {
        protected String color;

        public Shape(String color) {
            this.color = color;
        }

        public void showColor() {
            System.out.println("Color: " + color);
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double width, height;

        public Rectangle(String color, double width, double height) {
            super(color);
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle("Red", 3);
        Rectangle r = new Rectangle("Blue", 4, 5);
        c.showColor();
        System.out.println("Circle area: " + c.area());
        r.showColor();
        System.out.println("Rectangle area: " + r.area());
    }
}
