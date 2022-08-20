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
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();

        // int max = a;
        // if(b > max){
        //     max = b;
        // }
        // if(c > max){
        //     max = c;
        // }
        // System.out.print(max);

        //Uppercase/Lowercase
        // Scanner ob = new Scanner(System.in);
        // char ch = ob.next().trim().charAt(0);
        // if(ch >= 'a' && ch >= 'z'){
        //     System.out.println("Lowercase");
        // } else{
        //     System.out.println("Uppercase");
        // }

        //Print the fibonacci no.
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;
        // while(count <= n){
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        //     count++;
        // }
        // System.out.print(b);

        //Count the no. of 3s
        // int n = 2453738;
        // int count = 0;
        // while(n > 0){
        //     int rem = n % 10;
        //     if(rem == 3){
        //         count++;
        //     } 
        //     n = n / 10;

        // }
        // System.out.print(count);

        //Print the reverse of a number
        int num = 123456;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }
        System.out.print(ans);
        
    }
}