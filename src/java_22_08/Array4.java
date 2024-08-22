package java_22_08;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sorting an array

        int [] arr1= {14,56,78,1,67,12,5};

        Arrays.sort(arr1); // Arr1 will be sorted in ascending order

        for (int i : arr1){ // 1,5,12,14,56,67,78
            System.out.println(i);
        }
        for (int i= arr1.length-1; i>=0 ;i--){
            System.out.println(arr1[i]);
        }

//        // descending order

        int [] arr1Copy=new int[arr1.length];

        int y=0;
        for (int i= arr1.length-1; i>=0 ;i--){
            arr1Copy[i]=arr1[y];
            y++;
        }

        for (int i: arr1Copy){
            System.out.println(i);
        }


//        // Find the sum of the element of an array
//
        int [] arr2={34,67,29,14,90,89};

        int result=0;

        for (int i=0; i<=arr2.length-1;i++){
            result=result+arr2[i];
        }

        System.out.println("Sum of the elements is : "+result);
//
//        // Find the even odd from an array
//
        int [] even= new int[arr2.length];
        int [] odd= new int[arr2.length];
        int e=0;
        int o=0;

        for (int i=0; i<=arr2.length-1;i++){
            if (arr2[i]%2==0){
                even[e]=arr2[i];
                e++;
            }
            else {
                odd[o]=arr2[i];
                o++;
            }
        }
        System.out.println("Your Even elements are : ");
        for (int i:even){
            if (i != 0){
                System.out.println(i);
            }
        }
        System.out.println("Your odd elements are : ");
        for (int i:odd){
            if (i != 0){
                System.out.println(i);
            }
        }

        // find the max and min element from an array

        int [] array={34,67,90,2,3,76,5};

        // Easy Method

        Arrays.sort(array); // 2,3,34,67,76,90

        System.out.println("Min element is : "+array[0]);
        System.out.println("Max element is : "+array[array.length-1]);


    }
}