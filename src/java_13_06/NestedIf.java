package java_13_06;

public class NestedIf {
    public static void main(String[] args) {
//      nested if -> if statement inside an, another if statement

        int num1=17;

        if (num1>10){
            if (num1>15){
                System.out.println("greater than 15");
            }
            else {
                System.out.println("less than 15");
            }
        }
        else {
            System.out.println("less than 10");
        }









    }
}
