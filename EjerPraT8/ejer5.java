package EjerPraT8;

import java.util.Arrays;
import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lon;
        int comparar;
        int comparar2;
        int maximo = 0;
        int minimo = 101;
        int[] v;

        System.out.println("Longitud del vector");
        lon = sc.nextInt();
        v = new int[lon];

        for(int i = 0;i < v.length;i++){
            v [i] = (int) (Math.random()*100);
            comparar = v[i];
            comparar2 = v[i];
            if(comparar > maximo){
                maximo = comparar;
            }
            if(comparar2 < minimo){
                minimo = comparar2;
            }
        }

        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);

        System.out.println(Arrays.toString(v));

        System.out.println("Escribe la posicion que quieres remplazar");
        int pos = sc.nextInt();
        insertar(v, pos);

        System.out.println(Arrays.toString(v));
    }
    public static int[] insertar(int[] array, int posicion){
        Scanner scCambio = new Scanner(System.in);

        int[] nuevoArray = new int [array.length-1];

        System.arraycopy(array, 0,nuevoArray, 0,posicion-1);
        System.out.println("Nuevo numero: ");
        array[posicion] = scCambio.nextInt();

        System.arraycopy(array, posicion+1,nuevoArray, posicion,nuevoArray.length-posicion);
        return array;
    }
}
