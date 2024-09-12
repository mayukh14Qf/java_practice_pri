package java_12_09;

import java.util.Arrays;

public class ArrayRest {
    public static void main(String[] args) {

        // 3-D Array


        int [][][] a= {  {  {12,3,4},{4,6} }   ,  { {13,3},{2,3,6,} }   ,   { {1},{2,3},{3,6,7} }  };

        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[0][0].length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[0][0]));


        for (int i=0; i<=a.length-1;i++){ // It will Give me the direction for 2d array
            for (int j=0 ;j<=a[i].length-1;j++){ //It will Give me the direction for 3d array
//                System.out.print("{ ");
                for (int k=0; k<=a[i][j].length-1;k++){ // It will print all the elements of the a[i][j]
                    System.out.print(a[i][j][k]+" ");
                }
//                System.out.print("}");
            }
            System.out.println();

        }


    }
}
