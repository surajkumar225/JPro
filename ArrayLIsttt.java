import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListtt{
    public static void main(String[] arg){
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(497);
        list.add(603);
        list.add(345);
        list.add(927); 
        list.add(61);
        list.add(787);
        list.add(391);
        list.add(4902);
        list.add(65);

        System.out.println(list.contains(76543210));
        System.out.println(list);
    }
}