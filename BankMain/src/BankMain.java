public class BankMain {
    public static void main(String[] args)
    {
        // Kontouppgifter för två kunder
        BankAccount customer1 = new BankAccount("12345", "Anna Andersson", 1500.0);
        BankAccount customer2 = new BankAccount("67890", "Erik Eriksson", 2300.0);

        customer1.showAccountDetails();
        customer1.deposit(500.0);
        customer1.withdraw(2200.0);
        customer1.showAccountDetails();

        customer2.showAccountDetails();
        customer2.deposit(1000.0);
        double insättning2 = 1000;
    }
}