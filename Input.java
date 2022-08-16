import java.util.Scanner;

public class Input{
    public static void main(String[] arg){
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the roll no : ");
       int rollno = input.nextInt();
       System.out.println("Your roll no. is " + rollno);
        
    }
}