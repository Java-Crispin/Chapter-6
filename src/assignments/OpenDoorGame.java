package assignments;
        import java.util.Scanner;
        import java.util.Random;
public class OpenDoorGame {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int userChoice;
        Random rand = new Random();
        int randomPrize = rand.nextInt(3) + 1;
        String result = null;
        pl("Welcome to THE DOOR, the only game show with not one, but three doors.\n I am your host, guy door!\n Please choose your door! " +
                "Will it be door number 1? Perhaps the mysterious door 2? Or... the third door?");
        userChoice = input.nextInt();
        if(userChoice == 1 && randomPrize == 1){
            result = "a brand new car!";
        }
        else if(userChoice == 1 && randomPrize == 2){
            result = "about half a box of Crasins!";
        }
        else if(userChoice == 1 && randomPrize == 3){
            result = "three trillion dollars!";
        }
        else if(userChoice == 2 && randomPrize == 1){
            result = "a trip to Kansas!";
        }
        else if(userChoice == 2 && randomPrize == 2){
            result = "a brand new personal jet complete with engines!";
        }
        else if(userChoice == 2 && randomPrize == 3){
            result = "whatever was stuck to the back of my shoe this morning!";
        }
        else if(userChoice == 3 && randomPrize == 1){
            result = "an all expenses paid cruise to Alaska!";
        }
        else if(userChoice == 3 && randomPrize == 2){
            result = "your very own Wikipedia page!";
        }
        else if(userChoice == 3 && randomPrize == 3){
            result = "solid gold socks!";
        }
        else if(userChoice > 3){
            pl("Please choose a door!");
        }
        pl ("You won " + result);
    }
    public static void pl(String p){System.out.println(p);}
}