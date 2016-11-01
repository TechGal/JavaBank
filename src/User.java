import java.util.Scanner;

public class User {

    public static void main (String[] args) {

        Scanner user_input = new Scanner(System.in);
        Account a = new Account();


        System.out.println("Welcome to the bank!");
        System.out.println("Let's set up an account for you. What is you name?");
        String name = user_input.next();
        System.out.println("Hello, " + name);
        a.PrintID();

    }

}
