import java.lang.Double;

public class Account {

    public String Name;
    public Double Balance;
    public Double Amount;

    public void Deposit () {
        System.out.println("You would like to deposit $" + Amount);
        Balance = Balance + Amount;
        System.out.println("Deposit Complete");
        System.out.println("- - - - - - - - - - - - - - ");
    }

    public void Withdraw () {
        System.out.println("You would like to withdraw $" + Amount);
        Balance = Balance - Amount;
        System.out.println("Withdraw complete");
        System.out.println("- - - - - - - - - - - - - - ");
    }

    public void PrintID () {
        System.out.println("Printing account information: ");
        System.out.println("Name: "+ Name);
        System.out.println("Balance: $" + Balance);
        System.out.println("- - - - - - - - - - - - - - ");
    }

}
