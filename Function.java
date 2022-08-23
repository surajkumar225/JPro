import java.util.Scanner;

public class Function{
    public static void main(String[] arg){
        // int ans = sum(20,30);
        // System.out.print("The sum is : " + ans);

        // String check = myGreet("Dawson");
        // System.out.print(check);

        // int[] arr = {1, 2, 5, 9, 21};
        // change(arr);
        // System.out.println(Arrays.toString(arr));


        //Scope
        int a = 100;  //Initializing
        int b = 200;
        String name = "Surk";
        {
            a = 300;  //Updating
            System.out.println(a);
            int c = 400;
            name = "Daw";
            System.out.println(name);

        }
            System.out.println(a);
            System.out.println(name);
      
    }
    // static int sum(int a , int b){
    //         int sum = a + b;
    //         return sum;
    //     }

    // static String myGreet(String name){
    //     String message = "Hey " + name;
    //     return message;

    // static void change(int[] nums){
    //     nums[0] = 77;
    }
