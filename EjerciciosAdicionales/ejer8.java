package EjerciciosAdicionales;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes");
        int mes = sc.nextInt();
        System.out.println("Introduce el año");
        int anyo = sc.nextInt();

        if(mes == 1 && dia < 31 && anyo <=2023){
            System.out.println("Fecha valida");
        }else{
            System.out.println("No valido");
        }
        if(mes == 2 && dia < 28 && anyo <=2023){
            System.out.println("Fecha valida");
        }else{
            System.out.println("No valido");
        }
        if(mes == 3 && dia < 31 && anyo <=2023){
            System.out.println("Fecha valida");
        }else{
            System.out.println("No valido");
        }
        if(mes == 4 && dia < 30 && anyo <=2023){
            System.out.println("Fecha valida");
        }else{
            System.out.println("No valido");
        }
        if(mes == 5 && dia < 31 && anyo <=2023){
            System.out.println("Fecha valida");
        }else{
            System.out.println("No valido");
        }
        if(mes == 6 && dia < 31 && anyo <=2023){
            System.out.println("Fecha valida");
        }else{
            System.out.println("No valido");
        }

    }
}
