package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer6 {

    public static Integer funcionBinario(int num){
        if(num == 0){
            return 0;
        }else{
            int resto = num % 2;// te da el 0 o 1
            System.out.println(resto);
            int division = num / 2;// va bajando el numero
            return funcionBinario(division);
        }
    }
    public static Integer funcionOctal(int num){
        if(num == 0){
            return 0;
        }else{
            int resto = num % 8;
            System.out.println(resto);
            int division = num / 8;
            return funcionBinario(division);
        }
    }

    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero que quieres");
        int num = sc.nextInt();
        System.out.println("Binario:");
        funcionBinario(num);
        System.out.println("Octal:");
        funcionOctal(num);
    }
}
