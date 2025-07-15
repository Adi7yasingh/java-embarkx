public class AssignmentStatements18 {
    public static void main(String[] args) {
        /*
        There are 3 types of Assignment statements
        1. Simple statements
        2. Chained statements
        3. Compound statements
         */

       //simple
        int a = 1;

        int b;
        b = 4;

        //chained
        int x, y, z;
        x = y = z = 200;

        //combined
        // Whenever we use assignment operator with some another operator to initialize value.
        int i = 100;
        i += 50;
        System.out.println("Value of i = " + i);
    }
}
