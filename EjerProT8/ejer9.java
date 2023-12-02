package EjerProT8;

import java.util.Arrays;

public class ejer9 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for(int i = 0; i < 100;i++){
            num[i] = (int) (Math.random()*99 + 1);
        }

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("Numeros no encontrados");
        for(int i = 0;i < 100;i++){
            for(int e = 0;e < 100;e++){
                if(num[i] != e){
                    System.out.print(e + ",");
                }
            }
        }
        
    }
}
