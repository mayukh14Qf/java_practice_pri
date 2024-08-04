package java_04_08;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        String name="Java language";
        System.out.println(name.length());

        // Type casting for String

        // int to String
        String value=String.valueOf(34);
        System.out.println(value);

        // char to String
        String value2=String.valueOf('c');
        System.out.println(value2);

        System.out.println(value.getClass());
        System.out.println(value2.getClass());

        // String to int
        int value3=Integer.parseInt("23");
        System.out.println(value3);


        // Print all the characters of a String
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String var1=sc.nextLine();

        int size=var1.length();

        for (int i=0; i<=size-1;i++){
            System.out.println(var1.charAt(i));
        }

        // Find out all the vowels present in a string

        System.out.println("Enter Your String : ");
        String var2=sc.nextLine();

        int size1=var2.length();
        int count=0;
        for (int i=0;i<=size1-1;i++){
            if (var2.charAt(i)=='a' ||var2.charAt(i)=='e' ||
                    var2.charAt(i)=='i' ||var2.charAt(i)=='o' ||
                    var2.charAt(i)=='u' ){
                System.out.println(var2.charAt(i));
                count++;
            }
        }
        System.out.println("Number of vowels present are :"+count);

        // method 2

        String vowel="aeiouAEIOU";

        for (int i=0;i<=size1-1;i++){
            if (vowel.contains(String.valueOf(var2.charAt(i)))){
                System.out.println(var2.charAt(i));
            }
        }


    }
}
