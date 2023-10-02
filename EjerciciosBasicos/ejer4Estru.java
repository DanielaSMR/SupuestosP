package EjerciciosBasicos;

import java.util.Scanner;

public class ejer4Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados centigrados");
        int C = sc.nextInt();
        System.out.println("Serian " + (32 + ((C * 9)/5)) + " Grados Fahrenheit");
    }
    
}
