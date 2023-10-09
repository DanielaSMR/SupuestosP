package EjerciciosAdicionales;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contraseña = "hola";

        System.out.println("Escriba la contraseña");
        String intento1 = sc.nextLine();
        if(intento1.equals(contraseña)){
            System.out.println("Enhorabuena");
        }else{
            System.out.println("Escriba de nuevo contraseña");
            String intento2 = sc.nextLine();
            if(intento2.equals(contraseña)){
                System.out.println("Enhorabuena");
            }else{
                System.out.println("Escriba de nuevo contraseña");
                String intento3 = sc.nextLine();
                if(intento3.equals(contraseña)){
                    System.out.println("Enhorabuena");
                }else{
                    System.out.println("Error");
                }
            }
        }
    }
}
