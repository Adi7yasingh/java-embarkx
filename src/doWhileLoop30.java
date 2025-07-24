public class doWhileLoop30 {
    public static void main(String[] args){
    /*
        do {
            //statements
           } while (condition)

    */
    int counter = 1;

    do{
        System.out.println(counter + " I love java ");
        counter++;
    } while(counter < 16);

    System.out.println("out of loop");
    }
}
//even if the condition is false the statement within the loop to be executed atleast once.