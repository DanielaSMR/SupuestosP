package ejerciciosPropuestos2;

import java.util.Scanner;

public class ejer3 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Como de alta quieres la piramide?");
        int alturaMax = sc.nextInt();
        int nFinal = (alturaMax * 2) + 1;
        int espaciosPrimer = nFinal / 2; 
        int nS = 1;
        int alturaMax2 = alturaMax;
        int guardarEspacio = espaciosPrimer;
        
        while(alturaMax/2 > 0){
                for(int x = espaciosPrimer; x > 0; x--){
                System.out.print("X");
                x -=1;
                }
                for(int y = nS ;y > 0; y--){
                System.out.print("N");
                }
                nS = nS + 2;
                espaciosPrimer -= 1;
                alturaMax = alturaMax - 1;
                System.out.print("\n");
        }
        while(alturaMax2/2 > 0){
                for(int x = guardarEspacio; x > alturaMax2; x--){
                System.out.print("X");
                x -=1;
                }
                for(int y = nS ;y > 0; y--){
                System.out.print("N");
                }
                nS = nS - 2;
                guardarEspacio +=1;
                alturaMax2 = alturaMax2 - 1;
                System.out.print("\n");
        }

     }
}
