import java.util.Scanner;

public class CodingchallengeNestedif26 {
    public static void main(String[] args) {
        /*
        Write a java software for banks which allows users above 21 years of age to signup and create an account.
        If his age is above 55 years - create a senior citizen account for him and if his age is between 21 to 55 create normal savings account for him

        If the user is below 21 years of age don't allow them to create an account.

        If user is > 21 years of age but < 55 print "savings account"
        If user is > 55 years of age print "senior citizen account"
        If user is below 21 years of age print "ineligible"
         */

        System.out.println("Enter your age");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 21 && age <= 55){
            System.out.println("Savings account");
        } else if (age > 55) {
            System.out.println("Senior citizen account");
        }
        else {
            System.out.println("ineligible");
        }
    }
}
