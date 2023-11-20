package EjerProT8;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    static Scanner sc = new Scanner(System.in);

    static int numeroDeFilas;
    static int numeroDeColumnas;
    static int[][] matriz;

    public static Integer solicitarTamanyos(){
        System.out.println("Escribe cuantas filas tendra");
        numeroDeFilas = sc.nextInt();

        System.out.println("Escribe cuantas columnas tendra");
        numeroDeColumnas = sc.nextInt();
        
        return 0;
    }

    

    public static Integer asignarDatos(){
        int e = 0;
        for(int i = 0;i < matriz.length; i++){
            for(e = 0;e < matriz[i].length; e++){
                matriz [i][e] = (int) Math.random()*1 + 100;
            }
            e = 0;
        }
        System.out.println(Arrays.toString(matriz));
        return 0;
    }

}

