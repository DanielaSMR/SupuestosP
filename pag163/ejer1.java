package pag163;

import java.util.Arrays;
import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []num;
        num = new int[100];

        int suma = 0;
        int comparar = 0;
        int comparar2 = 0;
        int guardarNumMayor = 0;
        int guardarNumMenor = 101;

        for(int i = 0;i < 100;i++){
            num [i] = (int) (Math.random()*101);
            suma = suma + num[i];
            comparar = num[i];
            comparar2 = num[i];
            if(comparar > guardarNumMayor){
                guardarNumMayor = comparar;
            }
            if(comparar2 < guardarNumMenor){
                guardarNumMenor = comparar2;
            }
        }

        System.out.println(guardarNumMayor);
        System.out.println(guardarNumMenor);
        System.out.println(suma);
        System.out.println(suma / 100);
        System.out.println(Arrays.toString(num));

        System.out.println("Escribe el numero que quieres sustituir: ");
        int posicion = sc.nextInt();
        System.out.println("Dime el numero numero: ");
        int nuevoNum = sc.nextInt();
        
        insertar(num, posicion, nuevoNum);

        System.out.println(Arrays.toString(num));

    }
    public static int[] insertar(int[] array, int posicion, int nuevoNum){
        array[posicion] = nuevoNum;
        return array;
    }
}
