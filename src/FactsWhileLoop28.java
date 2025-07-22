public class FactsWhileLoop28 {
    public static void main(String[] args) {
        /*
        Facts about while loop
        1.Condition in while loop should always be boolean, you will gwt compile time error if it's anything other than boolean.
        example- while(true){} is valid
        but while(1){} is not valid because it is integer

        2.Curly braces for while loops are option. but if they are not used then the while loop can have 1 statement, and it should not be a declaration.
        example- while(true){}, while(true);, while(true){int x = 100;}  these all are valid
                 while(true) int x = 100; invalid
        3. While loop is majorly used in scenarios where we dont know the number of iterations upfront.

         */

        //example 1

       /* while(true){
        System.out.println("hello");
        }
        System.out.println("hi");
        //invalid because it is an infinite loop (unreachable statement)
         */

        //example 2
        while(false){
            System.out.println("hello"); //loop body is unreachable, it will never execute this code
        }
        System.out.println("hi");

    }
}
