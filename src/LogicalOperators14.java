public class LogicalOperators14 {
    public static void main(String[] args) {
        /*
        Logical operators
        &&(AND) ||(OR) !(NOT)
         */

        int a = 10;
        int b = 5;
        boolean c = true;

        // Logical AND (&&)
        System.out.println((a > b) && (a < 20)); // true && true = true
        System.out.println((a > b) && (a < 5));  // true && false = false

        // Logical OR (||)
        System.out.println((a < b) || (a > 5));  // false || true = true
        System.out.println((a < b) || (a < 5));  // false || false = false

        // Logical NOT (!)
        System.out.println(!c); // !true = false
        System.out.println(!(a == b)); // !(false) = true
        //not operator works only on one operand

        //logical operators only take boolean values and also return boolean


    }
}
