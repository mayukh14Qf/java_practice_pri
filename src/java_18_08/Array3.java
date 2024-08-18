package java_18_08;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check A Character is Vowel or not (using array)

        System.out.println("Enter Your Character : ");
        char alphabet= sc.next().charAt(0);

        char [] vowels={'a','e','i','o','u','A','E','I','O','U'};

        for (int i=0; i<=vowels.length-1;i++){
            if (vowels[i]==alphabet) {
                System.out.println("it is vowel");
            }
        }

        // Check no of vowels present in a string (using array)

        System.out.println("Enter Your String : ");
        String s1=sc.nextLine();

        char [] vowels1={'a','e','i','o','u','A','E','I','O','U'};
        for (int i=0; i<=s1.length()-1;i++){
            for (int j=0;j<=vowels1.length-1;j++){
                if (s1.charAt(i)==vowels1[j]){
                    System.out.println(s1.charAt(i));
                }
            }
        }


        // Check No of Vowels Present in an Array

        System.out.println("Enter Your Array Size : ");
        int size=sc.nextInt();

        char [] arr= new char[size];

        for (int i=0;i<=size-1;i++){
            arr[i]=sc.next().charAt(0);
        }

        String vowels2="aeiouAEIOU";

        for (int i=0;i<= arr.length-1;i++){
            if (vowels2.contains(String.valueOf(arr[i]))){
                System.out.println(arr[i]);
            }
        }



        // Converting String into Array

        String name1="Mayukhjit2001_";
        char [] charArray=name1.toCharArray();// {'M','a','y','u'.....}

        for (int i=0; i<= charArray.length-1;i++){
            System.out.println(charArray[i]);
        }

        for (char c: charArray){
            System.out.println(c);
        }

        // String Method (Split)

        String s4="Mayukhjit#Darothi#Tanisha#Rimpa";

        String [] nameArray=s4.split("#");

        for (String s: nameArray){
            System.out.println(s);
        }

        // Converting An Array into String

        String [] nameArray1={"Shaina","Debdup","Dishani","Bhaskar"};
        System.out.println(String.join("_",nameArray1));

//        System.out.println(Arrays.toString(nameArray1));


    }
}
