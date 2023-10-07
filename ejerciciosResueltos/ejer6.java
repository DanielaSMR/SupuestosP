package ejerciciosResueltos;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero de 3 cifras");
        int num = sc.nextInt();//123
        int a = num%10;//3
        int b = num/10;//12
        int d = b%10;//2
        int c = b/10;//1

        int potencia1 = a*a*a;
        int potencia2 = d*d*d;
        int potencia3 = c*c*c;
        if(potencia1 + potencia2 + potencia3 == num){
            System.out.println("Es un numero Armstrong");
        }else if(potencia1 + potencia2 + potencia3 != num){
            System.out.println("No es un numero Armstrong");
        }else{
            System.out.println("Error");
        }
    }
}
