public class ForEachLoop_37 {
    public static void main(String[] args) {

//exclusively it is used for array
//for each is a special type of for loop designed to traverse through the array objects and collections.
        /*
         for(data_type item : collections){
         //statements
         }

         //collection- a collection or array that you have to loop through.
         //item - a single item from the collections.

        */
        int a[] = {10,20,30,40,50}; //defining array
        for(int x : a){

            System.out.println("Value : " + x);
        }
    }
}
