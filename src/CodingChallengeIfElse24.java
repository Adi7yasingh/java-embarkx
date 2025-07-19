import java.util.Scanner;

public class CodingChallengeIfElse24 {
    public static void main(String[] args) {
        //coding challenge
        /*
        Write a java software for a bank which allows users above 21 years of age
        to sign up and create an account. If the user is below the age of age 21
        don't allow them to create account.

        if user is above 21 years of age --print "eligible"
        if user is below 21 years of age --print "ineligible"

        sample input 1
        18
        sample output
        Ineligible

        sample input 2
        33
        sample output
        eligible

         */
        System.out.println("Please enter your age");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 21){
            System.out.println("eligible");
        }
        else{
            System.out.println("ineligible");
        }
    }
}
