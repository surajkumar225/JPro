import java.util.Scanner;

public class SwitchNest{
    public static void main(String[] arg){
       Scanner in = new Scanner(System.in);
       String marvel = in.next();
       String starwars = in.next();

       switch (marvel) {
        case "Captain":
            System.out.println("On your left");            
            break;

        case "Tony":
            System.out.println("Lets do this");            
            break;

        case "Team":
            System.out.println("TeamUp");
            switch (starwars) {
                case "Lucifer":
                System.out.println("Stargazing");            
                break;

                case "Hayane":
                System.out.println("Townmaster");            
                break;
            }
            break;      
        default:
            System.out.println("Avengers assemble!");            
       }


    // int day = in.nextInt();
    // switch (day) {
    //     case 1 -> System.out.println("Monday");
    //     case 2 -> System.out.println("Tuesday");
    //     case 3 -> System.out.println("Wednesday");
    // }



    }
} 