import java.util.Scanner;

public class Array{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        // int[] ros;
        // ros = new int[5];
        // System.out.println(ros[2]);

        // String[] word = new String[5];
        // System.out.println(word[2]);

        int[] arr = new int[2];
        // arr[0] = 45;
        // arr[1] = 54;
        // System.out.print(arr[1]);

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        // for(int i=0; i<arr.length; i++){
        //    System.out.print(arr[i] + " ");
        // }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}