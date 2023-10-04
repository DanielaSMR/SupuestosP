package ejerciciosPracticos;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el año");
        int año = Integer.parseInt(args[0]);

        if(año% 4 == 0 ){
            System.out.println("Es un año bisiesto");
        }
        else if(año%100 == 0 && año%400 == 1){
            System.out.println("Es un año bisiesto");
        }
        else{
            System.out.println("No es un año bisiesto");
        }
    }
}
