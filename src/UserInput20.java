import java.util.Scanner;

public class UserInput20 {
    public static void main(String[] args) {
        //accepting user input
        /*Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username = ");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
        */
        System.out.println("Hello! What's your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("You are "+ age + " years old ");

    }
}
