import java.util.Random;

public class ejer1 {
    public static void main(String[] args) {
        int []num;
        num = new int[100];

        for(int i = 0;i < 100;i++){
            num [i] = (int) (Math.random()* 999);
            System.out.println(num[i]);
        }
    }
}
