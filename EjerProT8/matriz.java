package EjerProT8;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    private int numeroDeFilas;
    private int numeroDeColumnas;
    private int[][] matriz;

    

    public void solicitarTamanyos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuantas filas tendra");
        numeroDeFilas = sc.nextInt();

        System.out.println("Escribe cuantas columnas tendra");
        numeroDeColumnas = sc.nextInt();
        
        matriz = new int[numeroDeFilas][numeroDeColumnas];
    }

    public int getNumeroDeFilas() {
        return numeroDeFilas;
    }

    public void setNumeroDeFilas(int numeroDeFilas) {
        this.numeroDeFilas = numeroDeFilas;
    }

    public int getNumeroDeColumnas() {
        return numeroDeColumnas;
    }

    public void setNumeroDeColumnas(int numeroDeColumnas) {
        this.numeroDeColumnas = numeroDeColumnas;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    

    /*public static Integer asignarDatos(){
        int e = 0;
        int i = 0;
        while(e != 8 && i != 5){
            for(i = 0;i < Matriz.length;i++){
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
    }*/

}

