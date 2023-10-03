package ejerciciosPracticos;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--¿Calculadora!--");
        System.out.println("Introduce los numeros con los que quieres operar");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Escribe que operacion quiere hacer");
        String operacion = args[0];

        //Integer parseInt = args[1]

        if(operacion == "suma"){
            System.out.println(num1 + num2);
        }
        else if(operacion == "resta"){
            System.out.println(num1 - num2);
        }
        else if(operacion == "multiplicacion"){
            System.out.println(num1*num2);
        }
        else if(operacion == "division"){
            System.out.println(num1/num2);
        }
        else if(operacion == "potencia"){
            double elevado = Math.pow(num1, num2);
            System.out.println(elevado);
        }
        else{
            System.out.println("*error*");
        }
    }
}
