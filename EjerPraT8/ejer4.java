package EjerPraT8;

import java.util.Arrays;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matriz = new int [4][4];

        int i = 0;
        int e = 0;
        int a = 0;
        int b = 0;
        int n = 0;
        int m = 0;
        int sumafila = 0;
        int sumacolumna = 0;
        int sumatotal = 0;
        int sumadiagonal = 0;
        int sumadiagonalI=0;

        while(e != 4 && i != 4){
            for(i = 0;i < matriz.length;i++){
                for(e = 0;e < matriz[i].length;e++){
                    System.out.println("Escribe el numero de: fila " + e + " columna " + i);
                    matriz [i][e] = sc.nextInt();
                    if(e == 4 && i != 4){
                        e = 0;
                    }
                }
            }
        }
        for(b = 0;b < matriz.length;b++){
            for(a = 0;a < matriz[b].length;a++){
                System.out.print(matriz[b][a] + "\t");
            }
                System.out.println("\n");
        }

        System.out.println("Escribe la columna que quieres sumar(0,1,2,3)");
        int fila = sc.nextInt();
        for(int x = 0;x < matriz[fila].length;x++){
            sumafila = sumafila + matriz[x][fila]; 
        }
        System.out.println(sumafila);

        System.out.println("Escribe la fila que quieres sumar(0,1,2,3)");
        int columna = sc.nextInt();
        for(int y = 0;y < matriz[columna].length;y++){
            sumacolumna = sumacolumna+ matriz[columna][y]; 
        }
        System.out.println(sumacolumna);
        
        sumadiagonal = matriz[0][3] + matriz[1][2] + matriz[2][1] + matriz[3][0];
        sumadiagonalI = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
        System.out.println("suma diagonal " + sumadiagonal);
        System.out.println("suma diagonal inversa" + sumadiagonalI);
        
        for(n = 0;n < matriz.length;n++){
            for(m = 0;m < matriz[n].length;m++){
                sumatotal = sumatotal + matriz[m][n];
            }
        }
        System.out.println(sumatotal);
    }
}
