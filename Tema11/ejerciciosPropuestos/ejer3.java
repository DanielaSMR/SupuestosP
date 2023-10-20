package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer3 {
    public static Integer funcionCuadrado(int f, int c){
        if(f == 1){
            return 1;
        }
        if(c == 1){
            return 1;
        }else{
            return funcionCuadrado(f - 1, c) + funcionCuadrado(f, c - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas lineas quieres?");
        int numLineas = sc.nextInt();
        int y= numLineas;

        for(int f = 1;f <= numLineas;f++){
            for(int c = 1;c <= 5;c++){
                System.out.print(funcionCuadrado(f, c) + "\t");
            }
            System.out.println(" ");

        }
    }
}
