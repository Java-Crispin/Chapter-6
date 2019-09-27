// FixDebugSix2.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
package debugging;
public class FixDebugSix2 {
    public static void main(String args[]) {
        char letter;
        int a;
        final int MIN = 65;
        final int MAX = 122;
        final int STOP_LINE1 = 84;
        final int STOP_LINE2 = 104;
        for(a = MIN; a <= MAX; a++)
        {
            letter = (char)a;
            System.out.print("  " + letter);
            if(a == STOP_LINE1||a == STOP_LINE2)
            System.out.println();
        }
        System.out.println("/nEnd of application");
    }
}