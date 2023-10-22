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
            return funcionOctal(division);
        }
    }

    public static Integer funcionHexa(int num){
        if(num == 0){
            return 0;
        }else{
            int resto = num % 16;
            if(resto == 10){
                System.out.println("A");
            }else if(resto == 11){
                System.out.println("B");
            }else if(resto == 12){
                System.out.println("C");
            }else if(resto == 13){
                System.out.println("D");
            }else if(resto == 14){
                System.out.println("E");
            }else if(resto == 15){
                System.out.println("F");
            }else{
                System.out.println(resto);
            }
            int division = num / 16;
            return funcionHexa(division);
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero que quieres");
        int num = sc.nextInt();
        System.out.println("Leer de abajo a arriba :)");
        System.out.println("Binario:");
        funcionBinario(num);
        System.out.println("Octal:");
        funcionOctal(num);
        System.out.println("Hexadecimal");
        funcionHexa(num);
    }
}
