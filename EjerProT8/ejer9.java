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

        int numeroFaltante = 0;

        System.out.println("Numeros no encontrados");
        for (int i = 0; i < num.length; i++) {
            while (numeroFaltante < num[i]) {
                System.out.print(numeroFaltante + " ");
                numeroFaltante++;
            }
    
            if (numeroFaltante == num[i]) {
                    numeroFaltante++;
            }
        }
    }
    
}
