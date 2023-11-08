package EjerPraT8;

import java.util.Arrays;

public class ejer1 {
    public static void main(String[] args) {
        int []num;
        num = new int[101];

        int suma = 0;
        int numeros = 0;

        for(int i = 1;i <= 100;i++){
            numeros = i;
            num [i] = numeros;
            suma = suma + num[i];
        }

        double media = suma / 100;

        System.out.print(Arrays.toString(num) + "\n");
        System.out.println(suma);
        System.out.println(media);
    }
}
