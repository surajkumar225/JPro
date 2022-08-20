import java.util.Scanner;

public class Function{
    public static void main(String[] arg){
        // int ans = sum(20,30);
        // System.out.print("The sum is : " + ans);

        String check = myGreet("Dawson");
        System.out.print(check);

       
    }
    // static int sum(int a , int b){
    //         int sum = a + b;
    //         return sum;
    //     }

    static String myGreet(String name){
        String message = "Hey " + name;
        return message;
    }
}