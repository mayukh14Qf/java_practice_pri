package java_08_08;

public class Array1 {
    public static void main(String[] args) {

        // Syntax

        // ( type )(symbol) (var name) = values;

        // static initialization
        // does not need any size

        int [] numbers= {10,20,90,70,60,6,90}; // each and every value should be in declared form
        char [] chars={'A','D','T','R','M'};
        String [] names={"Antar","Darothi","Rimpa"};
        double [] nums={20.56,78.45,90.78};

        // accessing the elements by giving the index value
        System.out.println(numbers[2]); // varName[indexPosition]
        System.out.println(chars[4]);
        System.out.println(names[2]);

//        System.out.println(numbers.length);
//        System.out.println(names.length);

        // Size of the array is fixed(dynamic initialization)
        int [] numbers1= new int[5]; // [size]
        char [] chars1=new char[4];

        // size 5 -> starting index will be 0
        // ending index will be (5-1)=4 (length-1)
        // storing
        numbers1[0]=87;
        numbers1[1]=65;
        numbers1[2]=66;
        numbers1[3]=78;
        numbers1[4]=99;

        chars1[0]='U';
        chars1[1]='A';
        chars1[2]='E';
        chars1[3]='P';

        // printing array elements
        for (int i=0; i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }
        for (int i=0; i<=chars.length-1;i++){
            System.out.println(chars[i]);
        }


    }
}
