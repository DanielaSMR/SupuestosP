package EjerProT8;

import java.util.Arrays;

public class ejer8 {
    public static void main(String[] args) {
        int []num =  new int[100];
        
        for(int i = 0;i < 100;i++){
            num [i] = (int) (Math.random()*71 + 10);
            
        }

        System.out.println(Arrays.toString(num));

        int valorMasRepetido = encontrarElementoMasRepetido(num);
        System.out.println("El valor mas repetido es: " + valorMasRepetido);

    }
    private static int encontrarElementoMasRepetido(int[] vector) {
        int[] frecuencia = new int[81];

        for (int elemento : vector) {
            frecuencia[elemento]++;
        }

        System.out.println(Arrays.toString(frecuencia));

        int maxFrecuencia = 0;
        int elementoMasRepetido = 0;

        for (int i = 10; i <= 80; i++) {
            if (frecuencia[i] > maxFrecuencia) {
                maxFrecuencia = frecuencia[i];
                elementoMasRepetido = i;
            }
        }

        return elementoMasRepetido;
    }
}
