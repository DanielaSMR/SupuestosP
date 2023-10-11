package EjerciciosAdicionales;
import java.io.*;
import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto numeros se van a imprimir");
        int num = sc.nextInt();
        int y =2;
        int numMostrado = 1;

        whie(num > 0 ){
            for(int x = 1; x > y;x++){
                System.out.println(numMostrado);
                numMostrado +=1;
            }
            y = y + 2;
            num = num - 1;
            System.out.println("\n");
        }




        /*int nFinal = num; 
        int espaciosPrimer = nFinal / 2;
        int nS = 1;
        int numMostrado = 1;
        
        while(num > 0){
            for(int x = espaciosPrimer; x > num; x--){
            System.out.print(numMostrado);
            x -=1;
            numMostrado +=1;
            }
            espaciosPrimer +=1;
            num = num - 1;
            System.out.print("\n");
    }*/
    }
}
