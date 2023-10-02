package EjerciciosBasicos;

import java.util.Scanner;

public class ejer3Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num =sc.nextInt();
        int num2 = num;
        System.out.println(num);
        System.out.println("El doble" + num * 2);
        System.out.println("El triple" + num2 * 3);
    }
}
