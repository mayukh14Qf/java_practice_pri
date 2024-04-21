package java_21_04;

public class Incre_Decre {
    public static void main(String[] args) {
        int a=10;
        a=21; // override
        System.out.println(a); // now my a is 21

        a=a+1; // a is 22
        System.out.println(a);

        a=a+28; // Increment w.r.t  the previous value , a is 50
        System.out.println(a);

        a=a-10; // Decrement w.r.t the previous value as well, a is 40
        System.out.println(a);

        a++; // a=a+1; a is 41
        System.out.println(a);

        a--; // a=a-1; a is 40
        System.out.println(a);

        a=a*20; // a= 40*20=800
        System.out.println(a);

        a=a/10; // 80
        System.out.println(a);

        a+=2; // a=a+2; a is 82
        System.out.println(a);

    }
}
