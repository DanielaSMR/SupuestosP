package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer4 {

    public static Integer funcion(int f, int c){
        if(f==1){
            return 1;
        }
        if (c==1){
            return 1;
        }
        if(f == 2 && c == 2){
            return 1; 
        } else if (c == 2){
            return funcion(f - 1, c - 1) + funcion(f - 1, c);
        } else if(c==f * 2 -1){
            return 1;
        } else if(c == f * 2 - 2){  
            return funcion(f - 1, c - 1) + funcion(f - 1, c - 2); 
        } else {
            return funcion(f - 1, c - 2) + funcion(f - 1, c - 1) + funcion(f - 1, c);
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas lineas quieres?");
        int alturaMax = sc.nextInt();
        int nFinal = (alturaMax * 2) + 1; 
        int espaciosPrimer = nFinal / 2;
        int nS = 1;
        
        /* while(alturaMax > 0){
            for(int x = espaciosPrimer; x > 0; x--)
                System.out.print(" ");
                
            for(int y = nS ;y > 0; y--)
                System.out.print("1");
            
            nS = nS + 2;
            espaciosPrimer -= 1;
            alturaMax = alturaMax - 1;
            System.out.print("\n");
        } */

        for(int f = 1;f <= alturaMax;f++){
            for(int e = alturaMax; e >= f; e--){
                System.out.print(" " + "\t");
                
            }
            for(int c = 1;c <= f * 2 - 1;c++){
                System.out.print(funcion(f, c) + "\t");
            }
            System.out.println(" ");
        }
    }
}
