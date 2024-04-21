package java_21_04;

public class Arithmetic {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//  Addition
        int c1=a+b;
        float c2;
        c2=a+b;
// Subtraction
        int c3=b-a;
// Multiplication
        int c4=a*b;
// Division for Integer
        int c=30;
        int d=4;
        int c5=c/d;
// Division for float
        float e=30;
        float f=4;
        float c6=e/f;
// Modulo
        int c7=c%d; // It will give me reminder of a division operation

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);

        // Important Points to be noted

        int a1=789345;
        int b1=10; // only applicable when we are doing the operation with 10

        System.out.println(a1/b1); // all the digits excluding the last digit
        System.out.println(a1%b1); // only the last digit
    }
}
