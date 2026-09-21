// Encapsulation Program 2: Bank account protects its balance
public class Encapsulation2_BankAccount {

    static class BankAccount {
        private String owner;
        private double balance;   // hidden from outside

        public BankAccount(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        // balance can only change through these methods
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit must be positive");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount");
            }
        }

        public double getBalance() {
            return balance;
        }

        public String getOwner() {
            return owner;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ali", 5000);
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(10000);   // fails, not enough money
        System.out.println(acc.getOwner() + " balance: " + acc.getBalance());
    }
}
