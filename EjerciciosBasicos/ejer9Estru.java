package EjerciciosBasicos;

import java.util.Scanner;

public class ejer9Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la longitud del triangulo isosceles");
        int longitud = sc.nextInt();
        System.out.println("El area es: " + longitud*longitud/2);
    }
}
