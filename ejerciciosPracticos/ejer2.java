package ejerciciosPracticos;

import java.util.Scanner;

public class ejer2 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu primer apellido");
        String apellido1 = sc.nextLine();
        System.out.println("Escribe tu segundo apellido");
        String apellido2 = sc.nextLine();
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();

        System.out.println(nombre + apellido1 + apellido2);

    }
}
