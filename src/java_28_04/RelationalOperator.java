package java_28_04;

public class RelationalOperator {
    public static void main(String[] args) {
//        Relational Operator (It will give me either true or false)
//        ==
        int a1=10;
        int b1=10;
        System.out.println(a1==b1); //true

        int a2=11;
        int b2=45;
        System.out.println(a2==b2); //false

        int a3=17;
        double b3=17.01;
        System.out.println(a3==b3); //false

        int a4=17;
        double b4=17.00;
        System.out.println(a4==b4); //true

//        !=

        int a5=15;
        int b5=15;
        System.out.println(a5 != b5); //false

        int a6=11;
        int b6=45;

        boolean c6=a6!=b6;
        System.out.println(c6); //true

//        > / >=

        int a7=11;
        int b7=45;

        boolean c7= b7>a7;
        System.out.println(a7>b7); //false
        System.out.println(c7); // true

        int a8=19;
        int b8=19;

        System.out.println(a8>b8); // False

//        < / <=

        int a9=87;
        int b9=87;

        System.out.println(a9<=b9); //true
        System.out.println(a9>=b9); // true
        System.out.println(a9>b9); // false
        System.out.println(a9<b9); // false

        int a10=20;
        System.out.println(a10>=50);//false
        System.out.println(a10<=20); //true
        System.out.println(a10<10); //False
        System.out.println(a10>=20); //true
        System.out.println(a10 >20); // false
        System.out.println(a10 <20); // false


        int a11=98;

        System.out.println( a11> 98);
        System.out.println(a11 < 98);
        System.out.println(a11 > 96);
        System.out.println(a11 < 100);
        System.out.println(a11 <110);

        System.out.println(a11>110);
        System.out.println(a11>1);
        System.out.println(a11>=98);
        System.out.println(a11 <= 98);

        System.out.println(a11 >21);
        System.out.println(a11<200);
        System.out.println(a11==34);
        System.out.println(a11!=76);
        System.out.println(a11==98);

    }
}
