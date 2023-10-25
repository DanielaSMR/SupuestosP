package Tema11.ejerciciosPracticos;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero");
        int numeroFibonacci = sc.nextInt();
        int y = 2;
        int x = 1;
        System.out.println("Iterativo");
        fibonacci_iterativo(numeroFibonacci);
        System.out.println("Recursivo");
        fibonacci_recursivo(numeroFibonacci, y, x);
    }

    public static Integer fibonacci_iterativo(int num){
        int numIterativo = 0;
        int num2 = 1;
        for(int i = 0;i <= num - 3; i++){
            if(numIterativo == 0){
                System.out.println(numIterativo);
                numIterativo = numIterativo + 1;
                System.out.println(numIterativo);
            }else if(numIterativo == 1){
                numIterativo = numIterativo + 1;
                System.out.println(numIterativo);
            }
            int suma = numIterativo + num2;
            num2 = numIterativo;
            numIterativo = suma;
            System.out.println(numIterativo);
        }
        return 0;
    }  

    public static Integer fibonacci_recursivo(int num, int y, int x){
        if(num >= 3){
            int suma = y + x;
            System.out.println(y);
            return fibonacci_recursivo(num - 1, suma, y);
        }else{
            return 0;
        }
        
    }
}
