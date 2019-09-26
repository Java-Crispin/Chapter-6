package assignments;
import java.util.Scanner;
public class evenEntryLoop {
    public static void main(String[] args) {
        int userEntry;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, please enter an even number, or the number 999 to quit.");
        userEntry = input.nextInt();
        while (userEntry < 999) {
            if (userEntry % 2 == 0) {
                System.out.println("GOOD JOB!");
                System.out.println("Please enter another even number.");
                userEntry = input.nextInt();
            } else {
                System.out.println("ERROR, please enter an even number.");
                userEntry = input.nextInt();
            }
            if(userEntry == 999 || userEntry > 999){
                System.out.println("Goodbye.");
            }
        }
    }
}