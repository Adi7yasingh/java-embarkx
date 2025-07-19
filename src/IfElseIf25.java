public class IfElseIf25 {
    public static void main(String[] args) {
        //if...else...if(laddered if else)
        //nested if statement

        int age = 22;

        if (age > 13) {
            System.out.println("Welcome to my website");
            if (age<=25 && age>=20){
                System.out.println("You are eligible for 20% discount"); //nested if
            }
        }
        else if (age == 13) {
            System.out.println("Please provide us your email-id");//laddered if else
        }
        else {
            System.out.println("You must be above 13 years of age");
        }
        System.out.println("Please leave your feedback");
    }

}
