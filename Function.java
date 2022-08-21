import java.util.Scanner;

public class Function{
    public static void main(String[] arg){
        // int ans = sum(20,30);
        // System.out.print("The sum is : " + ans);

        // String check = myGreet("Dawson");
        // System.out.print(check);

        int[] arr = {1, 2, 5, 9, 21};
        change(arr);
        System.out.println(Arrays.toString(arr));

       
    }
    // static int sum(int a , int b){
    //         int sum = a + b;
    //         return sum;
    //     }

    // static String myGreet(String name){
    //     String message = "Hey " + name;
    //     return message;

    static void change(int[] num){
        num[0] = 77;
    }
}