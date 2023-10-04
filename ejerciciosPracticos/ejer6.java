package ejerciciosPracticos;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Como de alta quieres la piramide?");
        int alturaMax = Integer.parseInt(args[0]);
        int nFinal = (alturaMax * 2) + 1; //Porque el numero de N que queda en la ultima fila,si en la primera tenemos una y cada fila aumentamos 2 el resultado la fila * 2 +1(porque se empieza en 1)
        int espaciosPrimer = nFinal / 2; //Porque el numero de N de la ultima fila es x la mitad es donde va estar la punta
        int nS = 1;

        //       N
        //      NNN
        //     NNNNN
        //    NNNNNNN
        //Sumar N al igual que lineas haya +2 1->N 2->NNN 3->NNNNN
        //Añadir los espacios
        
        while(alturaMax > 0){
                for(int x = espaciosPrimer; x > 0; x--){
                System.out.print(" ");//el primer for nos añade los espacios
                }
                for(int y = nS ;y > 0; y--){
                System.out.print("N");//el segundo nos pone las N
                }
                nS = nS + 2;//y el final del while nos suma y resta los valores para que las N aumenten y los demas valoren bajen para poder parar el codigo
                espaciosPrimer -= 1;
                alturaMax = alturaMax - 1;
                System.out.print("\n");
        }

    }

}
