// Polymorphism Program 4: Constructor overloading
public class Polymorphism4_ConstructorOverloading {

    static class Book {
        private String title;
        private String author;
        private double price;

        // no data given
        public Book() {
            this("Unknown", "Unknown", 0.0);
        }

        // only title given
        public Book(String title) {
            this(title, "Unknown", 0.0);
        }

        // everything given
        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void display() {
            System.out.println(title + " by " + author + " - Rs. " + price);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics");
        Book b3 = new Book("Clean Code", "Robert Martin", 3500);
        b1.display();
        b2.display();
        b3.display();
    }
}
