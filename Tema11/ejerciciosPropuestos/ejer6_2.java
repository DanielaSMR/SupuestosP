package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer6_2 {

    public static Integer funcionBinario(int num){
        if(num == 0){
            return 0;
        }else{
            int resto = num % 2;
            System.out.println(resto);
            int division = num / 2;
            return funcionBinario(division);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero que quieres");
        int num = sc.nextInt();
        System.out.println("Leer de abajo a arriba :)");
        System.out.println("Binario:");
        funcionBinario(num);
    }
}
