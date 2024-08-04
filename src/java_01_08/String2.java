package java_01_08;

public class String2 {
    public static void main(String[] args) {
        String var1="mayukhjit2001_";

        int size= var1.length();
        System.out.println(size);

        // Equals
        String var2="mayukhjit2001a_";

        System.out.println(var1.equals(var2));

        // contains

        System.out.println(var1.contains("r"));
        System.out.println(var1.contains("m"));

        // substring

        System.out.println(var1.substring(0,9));
        System.out.println(var1.substring(9,13));
        System.out.println(var1.substring(4));
        // starting point would the exact index
        // ending index should be incremented by 1

        //replace

        System.out.println(var2.replace('a','p'));
        System.out.println(var2.replace("mayukhjit","xyz"));


        // * (accessing each index value)

        System.out.println(var1.charAt(1));
        System.out.println(var1.charAt(4));


        // special content

        System.out.println(var1.indexOf('m',3)); // starting point will be restricted


        System.out.println(var2.indexOf('a'));// forward
        System.out.println(var2.lastIndexOf('a')); // reverse
    }
}
