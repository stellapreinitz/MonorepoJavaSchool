public class BankAccount
{
    String accountNumber;
    String owner;
    double balance;
    public BankAccount(String accountNumber, String owner, double balance)
    {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void showAccountDetails()
    {
        System.out.println("=====Account Details=====");
        System.out.println("Account: " + accountNumber);
        System.out.println("Name: " + owner);
        System.out.println("Balance: " + balance + " kr");
        System.out.println();
    }
    public void deposit(double amount)
    {
        {
            if (amount > 0)
            {
                balance += amount;
                System.out.println(owner + " deposited " + amount + " kr.");
            }
            else
            {
                System.out.println("Invalid amount.");
            }
        }
    }
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println(owner + " withdrew " + amount + " kr.");
        }
        else
        {
            System.out.println("Invalid transaction, cannot withdraw " + amount + " out of balance.");
        }
    }
}
