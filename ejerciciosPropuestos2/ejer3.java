package ejerciciosPropuestos2;

import java.util.Scanner;

public class ejer3 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Como de alta quieres la piramide?");
        int alturaMax = Integer.parseInt(args[0]);
        int nFinal = (alturaMax * 2) + 1;
        int espaciosPrimer = nFinal / 2; 
        int nS = 1;
        
        while(alturaMax > 0){
                for(int x = espaciosPrimer; x > 0; x--){
                System.out.print(" ");//el primer for nos añade los espacios
                }
                for(int y = nS ;y > 0; y--){
                System.out.print("N");//el segundo nos pone las N
                }
                nS = nS + 2;
                espaciosPrimer -= 1;
                alturaMax = alturaMax - 1;
                System.out.print("\n");
        }
     }
}
