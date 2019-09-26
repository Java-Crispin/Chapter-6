package assignments;
import java.util.Scanner;
public class countByThrees {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int userNumber;
        int i;
        int count = 0;
            System.out.println("Please enter a whole number, between 1 and 10.");
            userNumber = input.nextInt();
        for( i = 0; i <= 300; ++i){
            if(count % 10 == 0)
                System.out.println();
            if(i % userNumber == 0) {
                System.out.print(" " + i);
                count ++;
            }
        }
    }
}