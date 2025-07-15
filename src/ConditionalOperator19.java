public class ConditionalOperator19 {
    public static void main(String[] args) {
        /*
         Conditional operators [ternary operator]
        ?:
         */

        /*
        syntax
        boolean-expression ? true-expression : false expression
         */

        //find max value
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);

        //also it can be nested
        max = (20>50) ? 20 :((50>60) ?90 :100);
        System.out.println("max = " + max);
    }
}
