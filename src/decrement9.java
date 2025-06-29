public class decrement9 {
    public static void main(String[] args) {
         /*decrement types - pre, post
          pre decrement - value is decremented first and then assigned or used in an expression.
          post decrement - value is assigned or used first and then decremented.
        */

        int x = 100;
        int y = x--; //post decrement
        int z = --x; //pre decrement
        System.out.println("value of x = " + x);
        System.out.println("value of y = " + y);
        System.out.println("value of z = " + z);
    }
}
