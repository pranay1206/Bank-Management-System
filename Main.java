import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create one sample account
        BankAccount user1 = new BankAccount(101, "Ridam", 5000);

        int choice;

        do {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    double depositAmount = sc.nextDouble();
                    user1.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    user1.withdraw(withdrawAmount);
                    break;

                case 3:
                    user1.displayBalance();
                    break;

                case 4:
                    user1.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}