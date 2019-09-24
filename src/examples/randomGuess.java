package examples;
import java.util.Scanner;
import java.util.Random;
public class randomGuess {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = 999;
        int counter = 0;
        int rand_pick = rand.nextInt(100) + 1;
        while (choice !=rand_pick){
            counter++;
            System.out.println("Please pick a number between 1 and 100.");
            choice = input.nextInt();
            if (choice == rand_pick){
                System.out.println("Great guess, you win!");
            }else if(choice > rand_pick){
                System.out.println("Too high!");
            }
            else if(choice < rand_pick){
                System.out.println("Too low!");
            }
        }
        System.out.println("It took you " + counter + " guesses to get it.");
    }
}
