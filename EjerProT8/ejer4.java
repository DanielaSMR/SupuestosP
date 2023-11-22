package EjerProT8;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        nombre = nombre.toUpperCase();

        System.out.println("Escribe tu apellido");
        String apellido = sc.nextLine();
        apellido = apellido.toUpperCase();

        System.out.println("Escribe tu segundo apellido");
        String apellidoS = sc.nextLine();
        apellidoS = apellidoS.toUpperCase();

        String[] nombreCompleto = {nombre, apellido, apellidoS};
        System.out.println(nombre.substring(0 , 3) + apellido.substring(0 , 3) + apellidoS.substring(0 , 3));


    }
}
