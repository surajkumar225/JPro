import java.util.Arrays;

public class LSearch{
    public static void main(String[] arg){
        //   int[] nums = {54, 67, 45, 90, 30, 60};
        //   int target = 90;
        //   int ans = linearSearch(nums, target);
        //   System.out.println(ans); 

        String name = "Shar";
        char target = 'a';
        System.out.println(search(name, target));
    }
    //Search the array and if item found, Return it.. Otherwise return -1
    // static int linearSearch(int[] arr, int target) {
    //     if(arr.length == 0){
    //         return -1;
    //     }
    //     for(int i = 0; i < arr.length; i++){
    //         int element = arr[i];
    //         if(element == target){
    //             return i;
    //         }
    //     }
    //     return -1;

    //-----------------------------------------------
    // Search for a word in a string
    static boolean search(String str, char target){
        if(str.length() == 0){    //Length()---Is a function
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    }