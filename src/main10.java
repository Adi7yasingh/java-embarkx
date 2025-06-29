public class main10 {
    public static void main(String[] args) {
        //how ,pre ,post increment and decrement is used in an expression.
        int n1 = 100;
        int n2, n3;
        n2 = ++n1;
        n3 = n1++ + --n2;

        System.out.println("value of n1 = " + n1);
        System.out.println("value of n2 = " + n2);
        System.out.println("value of n3 = " + n3);

        /*
        n1= 102
        n2= 100
        n3= 101 + 100 = 201
         */
    }
}
