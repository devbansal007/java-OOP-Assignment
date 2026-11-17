public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1001", "Devansh Bansal", 5000.00);
        BankAccount account2 = new BankAccount("1002", "Aarav Sharma", 3000.00);


        System.out.println("===== Account 1 Transactions =====");
        account1.deposit(2000.00);
        account1.withdraw(1500.00);
        account1.withdraw(10000.00); 
        account1.checkBalance();


        System.out.println("\n===== Account 2 Transactions =====");
        account2.deposit(1000.00);
        account2.withdraw(500.00);
        account2.checkBalance();


        System.out.println("\n===== Final Account Details =====");
        System.out.println("\nAccount 1:");
        account1.displayDetails();

        System.out.println("\nAccount 2:");
        account2.displayDetails();
    }
}
