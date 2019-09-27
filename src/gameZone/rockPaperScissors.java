package gameZone;
import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int counter = 0;
        int userChoice = 0;
        pl("Welcome to virtual rock paper scissors!");
        pl("Please make your selection,\nTo choose rock, please press 1.\nTo choose paper, please pres 2.\nTo choose scissors, please press 3." +
                "\nTo exit please enter 999.");
        while(userChoice<999) {
        int computerChoice = rand.nextInt(3) + 1;
        String result = null;
            userChoice = input.nextInt();
            if (userChoice == 1 && computerChoice == 1) {
                result = "It's a draw!";
            } else if (userChoice == 1 && computerChoice == 2) {
                result = "Paper covers rock, you lose!";
            } else if (userChoice == 1 && computerChoice == 3) {
                result = "Your rock broke my scissors, you win!";
                counter++;
            } else if (userChoice == 2 && computerChoice == 1) {
                result = "Your paper covered my rock, you win!";
                counter++;
            } else if (userChoice == 2 && computerChoice == 2) {
                result = "It's a draw!";
            } else if (userChoice == 2 && computerChoice == 3) {
                result = "My scissors cut your paper, you loose!";
            } else if (userChoice == 3 && computerChoice == 1) {
                result = "My rock smashes your scissors, you loose!";
            } else if (userChoice == 3 && computerChoice == 2) {
                result = "Your scissors cut my paper, you win!";
                counter++;
            } else if (userChoice == 3 && computerChoice == 3) {
                result = "It's a draw!";
            } else if (userChoice > 3) {
                result = "Please enter a correct number.";
            }
            pl(result + "You have won the past " + counter + " times!");
        }
    }
    public static void pl(String p){System.out.println(p);}
}