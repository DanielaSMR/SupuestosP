package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas lineas quieres?");
        int numLineas = sc.nextInt();

        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;
        System.out.println(a + " " + b + " " +  c + " " + d + " " + e);
        for(int i = 0; i < numLineas - 1; i++){
            b = a + b;
            c = b + c;
            d = c + d;
            e = d + e;
            System.out.println(a + " " + b + " " +  c + " " + d + " " + e);
        }
    }
}
