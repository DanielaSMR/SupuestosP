package ejerciciosResueltos;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Te contara solo del 1 al 10");
        int numero = sc.nextInt();

        switch(numero){
            case 10:
                System.out.println("one,two,three,four,five,six,seve,eight,nine,ten");
                break;
            default:
                System.out.println("Solo cuenta del 1 al 10");
        }
    }
}
