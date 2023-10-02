package EjerciciosBasicos;

import java.util.Scanner;

public class ejer5Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio");
        double radio = sc.nextDouble();
        System.out.println("La longitud es: " + 2 * radio * 3.14);
        System.out.println("La circunferencia es: " + radio * radio *3.14);

    }
    
}
