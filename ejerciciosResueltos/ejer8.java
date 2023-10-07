package ejerciciosResueltos;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe numeros y termina cuando introduzca 999");
        int n = 0;
        int suma = 0;
        String str= "999";
        
        while(n != 999){
            System.out.println("Escribe un numero");
            n = sc.nextInt();
            if(n == 999){
                System.out.println(suma);
            }else{
            }
            suma = suma + n;
        }

    }
}
