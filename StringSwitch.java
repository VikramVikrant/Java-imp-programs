import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        System.out.println("Enter Cricket | Hockey | Football :>");
        Scanner s=new Scanner(System.in);
        String game=s.next();

        switch (game){
            case "Cricket":
                System.out.println("Let's play cricket ..........");
                break;
            case "Hockey":
                System.out.println("Let's play hockey...........");
                break;
            case "Football":
                System.out.println("Let's play football..........");
                break;
            default:System.out.println("You have entered a wrong input,rerun it again...");
        }


    }
}
