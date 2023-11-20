package EjerProT8;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    static Scanner sc = new Scanner(System.in);

    static int numeroDeFilas = 5;
    static int numeroDeColumnas = 5;
    static int[][] matriz  = new int[numeroDeFilas][numeroDeColumnas];

    public static Integer solicitarTamanyos(){
        System.out.println("Escribe cuantas filas tendra");
        numeroDeFilas = sc.nextInt();

        System.out.println("Escribe cuantas columnas tendra");
        numeroDeColumnas = sc.nextInt();
        
        return 0;
    }

    

    public static Integer asignarDatos(){
        int e = 0;
        int i = 0;
        while(e != 8 && i != 5){
            for(i = 0;i < matriz.length;i++){
                for(e = 0;e < matriz[i].length;e++){
                    matriz [i][e] = (int) (Math.random()* 99);
                    System.out.print(matriz[i][e] + " ");
                    if(e == 8 && i != 5){
                        e = 0;
                    }
                }
                System.out.println("\n");
            }
        }
        System.out.println(matriz.toString());
        return 0;
    }

}

