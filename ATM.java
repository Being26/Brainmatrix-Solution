import java.util.Scanner;
public class ATM {
    private static double balance = 1000.00; 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to the ATM!");
        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }
    private static void depositMoney(Scanner scanner) 
    {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) 
        {
            balance += amount;
            System.out.printf("$%.2f has been deposited successfully.%n", amount);
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }
    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.printf("$%.2f has been withdrawn successfully.%n", amount);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient balance. Please try again.");
        } 
        
    }
}


