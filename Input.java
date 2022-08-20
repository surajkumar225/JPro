import java.util.Scanner;

public class Input{
    public static void main(String[] arg){
       Scanner input = new Scanner(System.in);
    // System.out.println("Please enter the roll no : ");
    // int rollno = input.nextInt();
    // System.out.println("Your roll no. is " + rollno);

    // int num1 = input.nextInt();
    // int num2 = input.nextInt();
    // int sum = num1 + num2;
    // System.out.println("Sum= " + sum);     
    
    //Type Casting
    // int num = (int)(273.23f);
    // System.out.println(num);

    //Automatic type promotion
    // int a = 260;
    // byte b = (byte)(a);   //------ 260 % 256 = 4
    // System.out.println(b);

    //Looping
    // int a = 10;
    // if( a == 10){
    //     System.out.print("Hey Trinity");
    // }

    int count = 1;
    while(count !=5){
        System.out.print(count);
        count++;
    }

    //For loop
    for(int count= 1; count !=5; count++){
        System.out.print(count);
    }

    
    }
}