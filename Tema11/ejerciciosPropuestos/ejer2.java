package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero");
        int numeroFibonacci = sc.nextInt();
        //System.out.println(numeroFactorial+ "*" + numeroFactorial + "=" + numeroFactorial * numeroFactorial);
        System.out.println("Recursivo");
        fibonacci_recursivo(numeroFibonacci);
        System.out.println("Iterativo");
        //factorialIterativo(numeroFibonacci);
    }

    public static Integer fibonacci_recursivo(int num){
        if(num == 1){
            return 1;
        }else{
            System.out.println(num);
            return fibonacci_recursivo(num - 1 + (num));
        }
    }  
}
