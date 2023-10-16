package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero");
        int numeroFactorial = sc.nextInt();
        int x = numeroFactorial;
        int y = numeroFactorial;
        //System.out.println(numeroFactorial+ "*" + numeroFactorial + "=" + numeroFactorial * numeroFactorial);
        System.out.println("Recursivo");
        factorialRecursivo(numeroFactorial, y);
        System.out.println("Iterativo");
        factorialIterativo(numeroFactorial, y);
        
    }

    public static Integer factorialRecursivo(int num, int mantenerNum){
        if(num == 1){
            return 1;
            
        }else{
            int resta = num - 1;
            int factor = mantenerNum * resta;
            System.out.println(resta + "*" + mantenerNum + "=" + factor);
            return factorialRecursivo(num - 1, factor);

        }
    }  
       
    public static Integer factorialIterativo(int num2, int mantenerNum2){
        for(int i = num2; i > 1;i--){
            num2 = num2 - 1;
            int factor = mantenerNum2 * num2;
            mantenerNum2 = factor;
            System.out.println(num2 + "=" + factor);
        }
        return 0;
    }
}
