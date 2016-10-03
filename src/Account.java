import java.lang.Double;

public class Account {

    private String Name;
    private Double Balance;
    private Double Amount;

    private void Deposit () {
        System.out.println("You would like to deposit $" + Amount);
        Balance = Balance + Amount;
        System.out.println("Deposit Complete");
        System.out.println("- - - - - - - - - - - - - - ");
    }

    private void Withdraw () {
        System.out.println("You would like to withdraw $" + Amount);
        Balance = Balance - Amount;
        System.out.println("Withdraw complete");
        System.out.println("- - - - - - - - - - - - - - ");
    }

    private void PrintID (
    ) {
        System.out.println("Printing account information: ");
        System.out.println("Name: "+ Name);
        System.out.println("Balance: $" + Balance);
        System.out.println("- - - - - - - - - - - - - - ");
    }

    public static void main (String args[]) {
        Account a = new Account();
        a.Balance = 0.0;
        a.Name = "John Smith";
        a.Amount = 10.00;
        a.Deposit();
        a.Deposit();
        a.Withdraw();
        a.PrintID();
    }

}
