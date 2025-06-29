public class incrementOperator8 {
    public static void main(String[] args) {

        /*increment types - pre, post
          pre increment - value is incremented first and then assigned or used in an expression.
          post increment - value is assigned or used first and then incremented.
        */

        int x = 100;
        int y = x++; //post increment
        int z = ++x; //pre increment
        System.out.println("value of x = " + x);
        System.out.println("value of y = " + y);
        System.out.println("value of z = " + z);



    }
}
