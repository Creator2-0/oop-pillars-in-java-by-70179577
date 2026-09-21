// Abstraction Program 4: Payment system hides how each method works
public class Abstraction4_PaymentInterface {

    interface Payment {
        void pay(double amount);

        String getMethodName();
    }

    static class CreditCardPayment implements Payment {
        private String cardNumber;

        public CreditCardPayment(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public void pay(double amount) {
            System.out.println("Paid " + amount + " using card ending " + cardNumber.substring(cardNumber.length() - 4));
        }

        public String getMethodName() {
            return "Credit Card";
        }
    }

    static class EasyPaisaPayment implements Payment {
        private String phone;

        public EasyPaisaPayment(String phone) {
            this.phone = phone;
        }

        public void pay(double amount) {
            System.out.println("Paid " + amount + " via EasyPaisa account " + phone);
        }

        public String getMethodName() {
            return "EasyPaisa";
        }
    }

    // checkout does not care which payment type it gets
    static void checkout(Payment p, double amount) {
        System.out.println("Method: " + p.getMethodName());
        p.pay(amount);
    }

    public static void main(String[] args) {
        checkout(new CreditCardPayment("1234567812345678"), 2500);
        checkout(new EasyPaisaPayment("03001234567"), 1200);
    }
}
