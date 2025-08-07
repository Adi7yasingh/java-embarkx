public class SwitchStatement_38 {
    public static void main(String[] args) {

/*
switch(variable/expression) {
     case value:
     //statement
     break;
     case value:
     //statement
     break;
    }
Rules :
* variable in switch statement can only be int, byte, short, char, String, enum, integer, Byte, Short, Character
* case label cannot have a variable, it has to be only constant
*/

        int month = 3;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("default");

        }
        System.out.println("Out of Switch");
    }
}
