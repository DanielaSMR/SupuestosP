package Tema11.ejerciciosPropuestos;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero");
        int numeroFactorial = sc.nextInt();
        int x = numeroFactorial;

        while(x > 0){
            factorialRecursivo(numeroFactorial);
            x -=1;
        }
        
    }

    public static Integer factorialRecursivo(int num){
        if(num >= 1){
            int resta = num - 1;
            int factor = num * resta;
            System.out.println(factor);
        }else{
            System.out.println("Error");
        }
        return 0;
    }
}
