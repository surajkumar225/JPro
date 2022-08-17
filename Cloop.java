import java.util.Scanner;

public class Cloop{
    public static void main(String[] arg){
        // int salary = 24000;
        // if(salary > 10000){
        //     salary += 4000;  // salary = salary + 4000        
        // } else if(salary > 15000){
        //     salary += 5000;
        // } else{
        //     salary += 6000;
        // }       
        // System.out.println(salary);

        //Print the maximum of 3 numbers
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.print(max);
    }
}