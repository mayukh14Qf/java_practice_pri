package java_11_08;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        // User input in Array

        System.out.println("Enter the size of the array : ");
        int size1=sc.nextInt(); // size of the array from my user

        int [] array1=new int[size1]; // creating an array of size (size)

        for (int i=0; i<= array1.length-1;i++){ // adding the value from user
            array1[i]=sc.nextInt();
        }
        System.out.println("\nyour array is : ");
        for (int i=0; i<= array1.length-1;i++){ // printing the elements
            System.out.println(array1[i]);
        }
        // Printing the elements(by using for each loop)
        // for each loop only applicable in array
        System.out.println("\nyour array is :(for each) ");
        for (int i : array1){ // (type should be matched with array type : array name)
            System.out.println(i);
        }


        // for string array (user input)
        System.out.println("Enter the size of the array : ");
        int size2=sc.nextInt(); // size of the array from my user
//        sc.nextLine();
        String [] array2=new String[size2]; // creating an array of size (size)

        for (int i=0; i<= array2.length-1;i++){ // adding the value from user
            array2[i]=sc.next(); //sc.nextLine();
        }
        System.out.println("\nyour array is : ");
        for (int i=0; i<= array2.length-1;i++){ // printing the elements
            System.out.println(array2[i]);
        }
        // Printing the elements(by using for each loop)
        System.out.println("\nyour array is :(for each) ");
        for (String j : array2){ // (type should be matched with array type : array name)
            System.out.println(j);
        }

    }
}
