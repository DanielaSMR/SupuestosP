package ejerciciosPracticos;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--¿Calculadora!--");
        System.out.println("Introduce los numeros con los que quieres operar");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Escribe que operacion quiere hacer 1-suma 2-resta 3-multiplicacion 4-division 5-potencia");
        int operacion = sc.nextInt();
        //String operacion = args[0];
        //Integer parseInt = args[1]

        if(operacion == 1){
            System.out.println(num1 + num2);
        }
        else if(operacion == 2){
            System.out.println(num1 - num2);
        }
        else if(operacion == 3){
            System.out.println(num1*num2);
        }
        else if(operacion == 4){
            System.out.println(num1/num2);
        }
        else if(operacion == 5){
            double elevado = Math.pow(num1, num2);
            System.out.println(elevado);
        }
        else{
            System.out.println("*error*");
        }
    }
}
