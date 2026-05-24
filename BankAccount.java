class BankAccount {

    int accountNumber;
    String name;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    // Withdraw
    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Account Details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}