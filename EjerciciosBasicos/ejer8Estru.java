package EjerciciosBasicos;

import java.util.Scanner;

public class ejer8Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el radio de la esfera");
        double radio = sc.nextDouble();
        System.out.println("El volumen es: "+ (((radio*radio*radio)*3.14)*4)/3);
    }
}
