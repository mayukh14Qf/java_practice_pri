package java_25_08;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // Spy Number
        // xyz =>  (x+y+z)==(x*y*z)
        // Eg: 1124 (1+1+2+4)==(1*1*2*4)==8 (This is A Spy Number)

        System.out.println("Enter A Number : ");
        int number=sc.nextInt(); // 1124

        int copyOfNumber=number;

        int sumOfDigits=0; //4+2=6+1=7+1=8
        int productOfDigits=1; //4*2=8*1=8*1=8


        while (number>0){
            sumOfDigits=sumOfDigits+(number%10);
            productOfDigits=productOfDigits*(number%10);
            number=number/10;
        }

        if (sumOfDigits==productOfDigits){
            System.out.println(copyOfNumber +" is a spy Number");
        }
        else {
            System.out.println(copyOfNumber+" is not a spy number ");
        }


        // Max And Min Element From An Array

        int [] numbers={12,34,1,4,89,-7};

        int max=Integer.MIN_VALUE; //89
        int min=Integer.MAX_VALUE; //-7

        for (int i=0;i<=numbers.length-1;i++){
            if (max<numbers[i]){
                max=numbers[i];
            }
            if (min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("The Max Element is "+max);
        System.out.println("The Min Element is "+min);

        // Reverse An Array

        int [] arr={23,29,14,27,11,78}; // 78,11,27,14,29,23

        int start=0; // 0
        int end= arr.length-1; //5

        while (start<end){ //
            int temp=arr[start]; // c=a
            arr[start]=arr[end]; // a=b
            arr[end]=temp;       // b=c
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr)); // String Format

        for (int i : arr){
            System.out.print(i+" "); // normal format
        }

        // Converting The String Array Into String

        String [] arr1={"abc","xyz","pqr"};
        System.out.println(String.join("/",arr1));

    }
}
