package java_04_07;

public class Loop3 {
    public static void main(String[] args) {


        // Print from 100 to 200 with an interval of 3
        // 100,103,106,..... so on

        for (int i=100;i<=200;i=i+3){
            System.out.println(i);
        }


        // Sum of odd numbers which available in the range of 20-50
        // 21,23,25... so on
        // sum= 21+23+25+.....+49

        int sum=0;

        for (int i=20; i<=50;i++){
            if (i%2 != 0){ // only for odd value
                sum=sum+i;
                System.out.println("for "+i+" your sum is "+sum);
            }
        }
        System.out.println("Your Ultimate sum is "+sum);





    }
}
