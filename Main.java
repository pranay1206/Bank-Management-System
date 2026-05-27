import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Method to find account
    static BankAccount findAccount(ArrayList<BankAccount> accounts, int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.accountNumber == accNo) {
                return acc;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    BankAccount newAcc = new BankAccount(accNo, name, bal);
                    accounts.add(newAcc);

                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int dAcc = sc.nextInt();

                    BankAccount acc1 = findAccount(accounts, dAcc);

                    if (acc1 != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();
                        acc1.deposit(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int wAcc = sc.nextInt();

                    BankAccount acc2 = findAccount(accounts, wAcc);

                    if (acc2 != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();
                        acc2.withdraw(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int bAcc = sc.nextInt();

                    BankAccount acc3 = findAccount(accounts, bAcc);

                    if (acc3 != null) {
                        acc3.displayBalance();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    int aAcc = sc.nextInt();

                    BankAccount acc4 = findAccount(accounts, aAcc);

                    if (acc4 != null) {
                        acc4.displayDetails();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}