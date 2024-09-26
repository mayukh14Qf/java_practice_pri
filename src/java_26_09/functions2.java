package java_26_09;

public class functions2 {

    // Definition

    public static void func1(){
        System.out.println("We are about to complete java...");
    }

    public static int func3(){
        return 10;
    }

    public static boolean func4(int num){
        int cc=num;
        int rev=0;
        while (cc>0){
            rev=(rev*10)+(cc%10);
            cc=cc/10;
        }
        if (rev==num){
            return true;
        }
        else {
            return false;
        }

//        return (rev==num)?true:false;
    }


    public static void main(String[] args) {
        // Function call will be done here
        func1();
        func2();
        int store=func3();
        System.out.println(store);
        System.out.println(func3());
        System.out.println(func4(101));
        System.out.println(func4(102));


        // Print All the palindromes from an array

        int [] arr={123,131,141,909,223,576};

        for (int i=0;i<= arr.length-1;i++){
            if (func4(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }

    }

    public static void func2(){
        System.out.println("Here, This is Mayukhjit");
    }


}
