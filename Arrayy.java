import java.util.Scanner;
import java.util.Arrays;

public class Arrayy{
    public static void main(String[] arg){
        int[] nums = {3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
}
static void change(int[] arr){
    arr[0] = 99;
}
}