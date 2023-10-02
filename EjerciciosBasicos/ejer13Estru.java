package EjerciciosBasicos;

import java.util.Scanner;

public class ejer13Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu dia de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Introduce tu año de nacimiento");
        int año = sc.nextInt();

        int dia1 = dia%10;//5
        int dia2 = dia/10;//2
        int sumaDia = dia1 + dia2;

        int mes1 = mes%10;//9
        int mes2 = mes/10;//0
        int sumaMes = mes1 + mes2;

        int año1 = año%10;//4
        int año2 = año/10;//200
        int año3 = año2%10;//0
        int año4 = año2/10;//20
        int año5 = año4%10;//0
        int año6 = año4/10;//2
        int sumaAño = año1 + año3 + año5 + año6;
        

        System.out.println("Tu numero de la suerte es: " + );

    }
}
