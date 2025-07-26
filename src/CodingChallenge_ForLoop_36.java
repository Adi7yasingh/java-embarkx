import java.util.Scanner;

public class CodingChallenge_ForLoop_36 {
    public static void main(String[] args) {
        /*
        Write a java program to accept integer from user and print its first 10 multiples using for loop.

        input = 5
        output
        5*1=5
        5*2=10
        5*3=15
        5*4=20
        5*5=25
        5*6=30
        5*7=35
        5*8=40
        5*9=45
        5*10=50
         */
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(number + "*" + i + "=" + number*i);
        }
    }
}
