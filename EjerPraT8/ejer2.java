package EjerPraT8;

import java.util.Arrays;

public class ejer2 {
    public static void main(String[] args) {
        int []walter;
        num = new int[100];

        for(int i = 0;i < 100;i++){
            num [i] = (int) (Math.random()*71+10);
        }

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        //int maximo = Math.max(num[0], num[100]);
        //System.out.println(maximo);
    }
}
