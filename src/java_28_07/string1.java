package java_28_07;

public class string1 {
    public static void main(String[] args) {

        // String is a Sequence of Characters
        // where a character can be
        // numeric,alphabet or special

        String var1= "Mayukhjit";
        String var2="8420577164";
        String var3="!@#$%^&*(";

        String var4="mayukhjit2001_";

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);


        // Concatenation

        System.out.println(2+5); // addition
        System.out.println("265"+"jfgd"+"#"+"gfajd"); // concatenation(as glue)

        // Length of a string

        System.out.println(var1.length());
        System.out.println(var2.length());
        System.out.println(var3.length());
        System.out.println(var4.length());

        // indexing
        // first index will be starting from 0
        // last index is (length -1)

        System.out.println(var1.indexOf('M'));
        System.out.println(var1.indexOf('t'));

        // if a particular character is not present
        // then it will print -1
        System.out.println(var1.indexOf("m")); // -1 -> absent

        String var5="khaioap";

        System.out.println(var5.indexOf('a')); // 2

        // Converting all the characters into upper and lower
        // case

        System.out.println(var4.toUpperCase());
        System.out.println(var1.toLowerCase());

        // printf
        int age =22;
        System.out.printf("my name is %s and my age is %d",var1,age);
    }
}
