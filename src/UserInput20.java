import java.util.Scanner;

public class UserInput20 {
    public static void main(String[] args) {
        //accepting user input
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username = ");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
    }
}
