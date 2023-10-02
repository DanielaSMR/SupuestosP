package EjerciciosBasicos;

import java.util.Scanner;

public class ejer6Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la velocidad en Km");
        int Km = sc.nextInt();
        System.out.println("La velocidad en m/s es: "+ Km/3.6);

    }
    
}
