import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Partridge Bank! What's your name?");
        String customerName = scanner.nextLine();
        System.out.println("Thank you for creating an account with our bank. Your starting balance is $50.00.");
        double accountBalance = 50.0;
        System.out.println("Please enter a positive number for a deposit or a negative value for a withdrawl:");
        double withdrawlOrDeposit = scanner.nextDouble();
        accountBalance += withdrawlOrDeposit;
        if(accountBalance < 0.0) {
            System.out.println("You've overdrafted! Please call us immediately, " + customerName + "!");
        }
        else {
            System.out.println("The amount has been received, " + customerName + "! Your account balance is: " + accountBalance + ".");
        }
        scanner.close();
    }
}