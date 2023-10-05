package ejerciciosPropuestos2;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
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
        
        int total = sumaAño + sumaMes + sumaDia;
        int total1 = total%10;//0
        int total2 = total/10;//220
        int total3 = total2%10;//0
        int total4 = total2/10;//22
        int total5 = total3%10;//2
        int total6 = total3/10;//2
        int sumaSemiTotal = total1 + total3 + total5 + total6;
        int semi1 = sumaSemiTotal%10;//5
        int semi2 = sumaSemiTotal/10;//1
        int sumaTotal = semi1 + semi2;

        System.out.println("Tu numero de la suerte es: " + sumaTotal);
    }
}
