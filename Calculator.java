import java.util.Scanner;

public class Calculator{
    public static void main(String[] arg){
       Scanner in = new Scanner(System.in);

       int ans = 0;
       while(true){
        System.out.print("Enter the operator: ");
        char op = in.next().trim().chatAt(0);
        // char op = in.next();
        // char op = in.trim();
        // char op = in.charAt();

        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            System.out.print("Enter two numbers: ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();

            if(op == '+') {
                ans = n1 + n2;               
            }
            if(op == '-') {
                ans = n1 - n2;               
            }
            if(op == '*') {
                ans = n1 * n2;               
            }
            if(op == '+') {
                if(n2 != 0){
                    ans = n1 / n2;
                }               
            }
            if(op == '%') {
                ans = n1 % n2;               
            }
        } else if(op == 'x' || op == 'X') {
            break;
        } else {
            System.out.println(ans);
        }

       }
    }
}