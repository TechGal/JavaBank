import java.util.Scanner;

public class User {

    public static void main (String[] args) {

        Scanner user_input = new Scanner(System.in);
        boolean using = true;
        Account a = new Account();
        Bank b = new Bank();
        double Money;


        System.out.println("Welcome to the bank!");
        System.out.println("Let's set up an account for you. What is you name?");
        String name = user_input.next();
        a.Name = name;
        a.Balance = 0.00;
        System.out.println("Hello, " + name);
        a.PrintID();
        System.out.println("You will be with the " + b.bankName + "Bank.");
        System.out.println("What would you like to do?");
        System.out.println("Please enter:");
        System.out.println("--'deposit' to deposit");
        System.out.println("--'withdraw' to withdraw");
        System.out.println("--'account' to view account information");
        System.out.println("--'close' to finish banking");

        while (using == true) {
            String action = user_input.next();
            action.toLowerCase();
            if (action.equals("deposit")) {
                System.out.println("How much would you like to deposit?");
                String bravo = user_input.next();
                Money = Double.parseDouble(bravo);
                a.Amount = Money;
                a.Deposit();
                System.out.println(Money + " has been deposited");
                System.out.println("- - - - - - - - - - - - - - ");
                System.out.println("Would you like to deposit, withdraw, view account details or close the bank?");
            }
            else if (action.equals("withdraw")) {
                System.out.println("How much would you like to withdraw?");
                String bravo = user_input.next();
                Money = Double.parseDouble(bravo);
                a.Amount = Money;
                a.Withdraw();
                System.out.println(Money + " has been withdrawn");
                System.out.println("- - - - - - - - - - - - - - ");
                System.out.println("Would you like to deposit, withdraw, view account details or close the bank?");
            }
            else if (action.equals("account")) {
                System.out.println("Here is your account information:");
                a.PrintID();
                System.out.println("- - - - - - - - - - - - - - ");
                System.out.println("Would you like to deposit, withdraw, view account details or close the bank?");
            }
            else if (action.equals("close")) {
                System.out.println("Thank you for banking with " + b.bankName + " Bank.");
                using = false;
            }
            else {
                System.out.println("Sorry, I didn't understand that.");
            }
        }

    }

}
