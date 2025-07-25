public class factsAboutDoWhileloop31 {
    public static void main(String[] args) {
        /*
        Curly braces are optional and without curly braces we can only take one statement between do and while which should not be declarative.

        do
         System.out.println("Hello");
        while(true);

        //example 1

        do{
         System.out.println("Hello");
        }while(true);
        System.out.println("Hello"); //unreachable statement because it is never ending loop/infinite loop

        //example 2

        int a = 10, b = 20;
        do{
            System.out.println("Hello");
        }while(a < b);
        System.out.println("hi"); // even though it is an infinite loop , the compiler does not show any error
                                  //because it is not substituting the value of a and b, because they are not hardcoded


        //example 3

        int a = 10, b = 20;
        do{
            System.out.println("Hello");
        }while(a > b);
        System.out.println("hi");


        //example 4

        final int a = 10, b = 20;
        do{
            System.out.println("Hello");
        }while(a < b); //so now we have hardcoded value compiler know that it is always true, so it will be an infinite loop and never stop
        System.out.println("hi"); //which will make it unreachable


        //example 5

        final int a = 10, b = 20;
        do{
            System.out.println("Hello");
        }while(a > b);
        System.out.println("hi");

        //example 6

        do
            System.out.println("Hello");
        while(true);

       //example 7

       do;
       while(true);

       //example 8

        do
           int x = 10; //declaration is not allowed
        while(true);

        //example 9
        do {
            int x = 10; //declaration is not allowed
        }while(true);

        //example 10
        do
            while(true); ///invalid code
         */


    }

}
