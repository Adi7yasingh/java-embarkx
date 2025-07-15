public class ImplicitTypeCasting16 {
    public static void main(String[] args) {
    byte b = 100;
    int i = b;
        System.out.println("Value of i = " + i);

    int i1 = 200;
    double d = i1;
        System.out.println("Value of d = " + d);

    char c = 'a';
    int c1 = c;
        System.out.println("Value of c1 = "+ c1);
/*
    points to remember
    1. Implicit type casting is performed when value of smaller data type is assigned to variable of larger data type.
    2. Implicit type casting is performed by compiler.
    3. Since the range of smaller data type is within the range of the larger data type, there is no loss in this type of conversion.
    4. This is also known as widening or upcasting.

    possible conversions
    byte > short > int > long > float > double
    char > int
 */
    }
}
