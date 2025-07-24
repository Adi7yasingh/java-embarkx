import java.util.Scanner;

public class CodingChallengeWhileloop29 {
    public static void main(String[] args) {
        /*
        Write a java program to accept an integer from user and print factorial of the number using while loop.
        factorial of 5(5!) = 5*4*3*2*1 = 120
         */

        System.out.println("Write a number to get its factorial");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int factorial = 1, i = 1;

        while(a >= i){
            factorial = factorial * i;
            i++;
        }






        System.out.println("Factorial of " + a + " is " + factorial);

    }
}
