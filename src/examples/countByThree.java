package examples;
public class countByThree {
    public static void main(String[]args){
        int count = 0;
        while (count < 300) {
            if (count % 3 == 0)
                System.out.println(count);
            count++;
        }
        while (count > 0) {
            if (count % 3 == 0)
                System.out.println(count);
            count--;
        }
    }
}