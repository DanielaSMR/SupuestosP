package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas lineas quieres?");
        int alturaMax = sc.nextInt();
        int nFinal = (alturaMax * 2) + 1; 
        int espaciosPrimer = nFinal / 2;
        int nS = 1;
        
        while(alturaMax > 0){
                for(int x = espaciosPrimer; x > 0; x--){
                System.out.print(" ");
                }
                for(int y = nS ;y > 0; y--){
                System.out.print("1");
                }
                nS = nS + 2;
                espaciosPrimer -= 1;
                alturaMax = alturaMax - 1;
                System.out.print("\n");
        }
    }
}
