package assignments;
public class countByThrees {
    public static void main(String[]args){
        for(int i = 0; i <= 300; ++i){
            if(i % 3 == 0)
                System.out.println(i);
        }
        for(int j = 207; j >= 0; --j){
            if(j % 3 == 0)
            System.out.println(j);
        }
    }
}
