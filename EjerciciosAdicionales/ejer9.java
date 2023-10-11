package EjerciciosAdicionales;
import java.io.*;
import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto numeros se van a imprimir");
        int num = sc.nextInt();
        int numero = 1;
        int fila = 1;

        while (numero <= num) {
            for (int i = 1; i <= fila; i++) {
                if (numero > num) {
                    break;
                }
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
            fila++;

    }
    }
}
