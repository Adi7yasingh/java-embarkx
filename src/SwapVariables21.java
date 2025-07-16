import java.util.Scanner;

public class SwapVariables21 {
    public static void main(String[] args) {
        //Swap two variables using third variable

        int a, b, temp;
        System.out.println("Enter two values to swap");
        Scanner sc = new Scanner(System.in); //scanner object

        a = sc.nextInt(); //read user input
        b = sc.nextInt(); //read user input

        temp = a;
        a = b;
        b = temp;

        System.out.println("value of First variable = " + a);
        System.out.println("value of Second variable = " + b);
    }
}
