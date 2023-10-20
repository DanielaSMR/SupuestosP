package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer6 {

    public static Integer funcionBinario(int num, int numMantener){
        if(num == 0){
            return 0;
        }else{
            num = num % 2;// te da el 0 o 1
            System.out.println(num);
            int division = numMantener / 2;// va bajando el numero
            return funcionBinario(division, division);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero que quieres");
        int num = sc.nextInt();
        funcionBinario(num, num);
        
    }
}
