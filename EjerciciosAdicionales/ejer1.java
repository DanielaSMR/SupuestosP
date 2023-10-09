package EjerciciosAdicionales;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Cuantas asignaturas has cursado?");
        double modulos = sc.nextInt();
        int notas = 0;
        int media = 0;
        
        for(int i = 0; i < modulos; i++){
            System.out.println("Escriba sus notas");
            notas = sc.nextInt();
            media = media + notas;
        }
        System.out.println("Nombre del alumno: " + nombre + "\n" + "Nota media del alumno: " + media/modulos);   

    }
}
