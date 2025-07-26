public class FactsAboutForLoop34 {
    public static void main(String[] args) {
// curly braces are optional. However, without curly braces, you are allowed to have one statement which is not a declaration.
   /*
        //example 1
          for(int i = 0; i < 10; i++)
            System.out.println("hello"); //this is valid

        //example 2
          for(int i = 0; i < 10; i++); //empty for loop, valid but of no use

        //example 3
        for(int i = 0; i < 10; i++)
            int x = 10;  // invalid, declartion is not allowed


    //facts about initialization section
        1. this section is executed only once in the lifecycle of the for loop.
        2. we are allowed to declare any number of variables in this section, however they should be of same datatype.
         //example  for(int i = 0, j =10 ; i < 10; i++)

        3. initialization can contain any valid java statement.
         //example
         int i = 0;
         for(System.out.println("hello"); i < 10; i++){
         System.out.println("java");
         }

     //facts about conditional section in for loop
        1. This part is optional, If we skip this part then compiler places "true"in its place.
        //example
        for(int i = 0; true ; i++){
        System.out.println("java");
        }

        2.conditional sections can have expressions however its output should always be boolean.

     //facts about increment or decrement section in for loop
        1. increment decrement section can contain any valid java statement
            //example
             for(int i = 0; i<10; System.out.println("java")){
            System.out.println("hi");
        }

        //example 2
        for(;;){}
        for(;;);   //these both will also work , they are infinite empty loops
    */

    }
}
