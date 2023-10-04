package ejerciciosPracticos;

import java.util.Scanner;

public class ejer2 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu primer apellido");
        String apellido1 = args[0];
        System.out.println("Escribe tu segundo apellido");
        String apellido2 = args[1];
        System.out.println("Escribe tu nombre");
        String nombre = args[2];

        System.out.println(nombre + apellido1 + apellido2);

    }
}
