package assignments;
import java.util.Scanner;
public class testScoreStatistics {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int high = 0;
        int low = 100;
        int average = 0;
        int count = 0;
        int userInput = 0;
        final int MIN_SCORE = 0;
        final int MAX_SCORE = 100;
        System.out.println("Welcome to the AutoGrader 9000, enter each Student's grade, if you wish to exit the program enter 999.");
        while(userInput != 999){
            if(userInput < MIN_SCORE){
                System.out.println("Please enter a correct grade.");
                userInput = input.nextInt();
            }
            else if(userInput > MAX_SCORE){
                System.out.println("Please enter a correct grade.");
                userInput = input.nextInt();
            }
            else{
                System.out.println("Please enter the next score.");
                count ++;
                total = total + (userInput);
                average = total / count;
                userInput = input.nextInt();
                if(userInput >= 999){
                }else{
                    high = userInput;
                }
                if(userInput < low){
                    low = userInput;
                }
            }
            if(userInput == 999){
                System.out.println("The total is "+total+"\nThe average is "+average+"\nThe highest score is "+high+"\nThe lowest score is "+low);
            }
        }
    }
}