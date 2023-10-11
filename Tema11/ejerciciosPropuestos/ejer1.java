package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero");
        int numeroFactorial = sc.nextInt();
        int x = numeroFactorial;
        int y = numeroFactorial;
        System.out.println(numeroFactorial+ "*" + numeroFactorial + "=" + numeroFactorial * numeroFactorial);

        factorialRecursivo(numeroFactorial, y);
        
    }

    public static Integer factorialRecursivo(int num, int mantenerNum){
        int suma = 0;
        if(num >= 1){
            int resta = num - 1;
            int factor = mantenerNum * resta;
            suma = factor + suma; 
            System.out.println(mantenerNum + "*" + resta + "=" + factor);
            return factorialRecursivo(num - 1, mantenerNum);

        }else{
        }
        System.out.println(suma);
        return 0;
    }  
       
    public static Integer factorialIterativo(int num2){
        return 0;
    }
}
