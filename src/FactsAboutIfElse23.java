public class FactsAboutIfElse23 {
    public static void main(String[] args) {
        boolean x = true;
        if(x = false){
            System.out.println("Hello world");
        }
        else{
            System.out.println("Hello java");
        }
    }
}
/*
        # if accepts only boolean
        1. if(x = 10) not work
        2. if(x == 10) will work
        3. boolean x = true;
           if(x = false)  this will also work

 */