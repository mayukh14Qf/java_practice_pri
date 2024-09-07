package java_07_09;

public class TwoDArray {
    public static void main(String[] args) {

        // declaration
        // (data type) (symbol) (symbol) (varName) .......;

        int [][] a= {   {10,20,30}   ,  {4,5}    };


        // Accessing the individual value

        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);

        System.out.println(a[1][0]);
        System.out.println(a[1][1]);

        System.out.println(a.length);
        System.out.println(a[0].length); // a[0] is a whole array
        System.out.println(a[1].length); // a[1] is a whole array

        // Accessing values via loop

        for (int i=0; i<=a.length-1;i++){
            for (int j=0; j<=a[i].length-1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
