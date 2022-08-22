import java.util.Arrays;

public class VarArgs{
    public static void main(String[] arg){
          fun(2, 3, 4, 5, 8, 10);
          multiple(3, 5, "Surk");
        }
        System.out.println(multiple);

    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v) {  //Internaly taking an array of integers
        System.out.println(Arrays.toString(v));
    }
}