import java.util.Scanner;

public class codingChallengeDoWhileLoop32 {
    public static void main(String[] args) {
      /* Write a do while loop that asks the users to enter two numbers.
         The number should be added and the sum displayed. After adding
         and printing, the loop should ask the user whether he or she
         wishes to perform the operation again. If so, the loop should
         repeat; otherwise it should terminate.
    */
        int input = 0;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter first number ");
            int num1 = sc.nextInt();
            System.out.println("Please enter second number ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of Two numbers is - " + sum);

            System.out.println("Press 1 to continue, to exit enter anything else");
            input = sc.nextInt();
        } while(input == 1);
        System.out.println("exit");

    }
}
