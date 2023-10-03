package ejerciciosPracticos;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Como de alta quieres la piramide?");
        int altura = sc.nextInt();
        int lineas = 0;
        //\n

        while(lineas <= altura){
            //Sumar N al igual que lineas haya 1->N 2->NN
            //Arreglar los espacios
            System.out.println("N" + "/n");
            lineas = lineas + 1;
        }
    }
}
