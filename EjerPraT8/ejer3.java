package EjerPraT8;

import java.util.Arrays;

public class ejer3 {
    public static void main(String[] args) {
        int [][]matriz = new int [5][8];

        int i = 0;
        int e = 0;

            for(i = 0;i < matriz.length;i++){
                for(e = 0;e < matriz[i].length;e++){
                    matriz [i][e] = (int) (Math.random()* 99);
                    System.out.print(matriz[i][e] + " ");
                }
                System.out.println("\n");
            }
    }
}
