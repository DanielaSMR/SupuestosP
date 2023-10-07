package ejerciciosResueltos;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe cuantas alturas vas añadir");
        int n = sc.nextInt();
        int altura = 0;
        int suma = 0;
        
        for(int i = 0; i < n; i++){
            System.out.println("Escriba la altura");
            altura = sc.nextInt();
            suma = suma + altura;
        }
        System.out.println(suma/n);        
    }
}
