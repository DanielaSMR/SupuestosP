package EjerPraT8;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matriz = new int [4][4];

        int i = 0;
        int e = 0;
        int suma = 0;

        while(e != 4 && i != 4){
            for(i = 0;i < matriz.length;i++){
                for(e = 0;e < matriz[i].length;e++){
                    System.out.println("Escribe el numero de: fila " + i + " columna " + e);
                    int num = sc.nextInt();
                    matriz [i][e] = num;
                    if(e == 4 && i != 4){
                        e = 0;
                    }
                }
            }
        }

        System.out.println("Escribe la fila que quieres sumar");
        int fila = sc.nextInt();
        
    }
}
