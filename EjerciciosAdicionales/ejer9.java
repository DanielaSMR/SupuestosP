package EjerciciosAdicionales;
import java.io.*;
import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto numeros se van a imprimir");
        int num = sc.nextInt();
        int nFinal = (num * 2) + 1; 
        int espaciosPrimr = nFinal / 2;
        int nS = 1;
        int numMostrado = 1;
        
        while(num > 0){
            for(int x = espaciosPrimer; x > num; x--){
            System.out.print(numMostrado);
            x -=1;
            numMostrado +=1;
            }
            nS = nS - 2;
            espaciosPrimer +=1;
            num = num - 1;
            //numMostrado +=1;
            System.out.print("\n");
    }
    }
}
