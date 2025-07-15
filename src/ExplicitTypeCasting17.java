public class ExplicitTypeCasting17 {
    public static void main(String[] args) {
        int i = 100;
        byte b = (byte)i; //byte is explicitly written
        System.out.println("value of b= "+ b);

        /*
        points to remember
        1. Explicit type casting is performed when value of larger data type is assigned to variable of smaller type.
        2. Explicit type casting is performed by the programmer manually.
        3. This is also known as narrowing or down casting.

        possible conversions

        double > float > long > int > short > byte
        int > char
         */
    }
}
