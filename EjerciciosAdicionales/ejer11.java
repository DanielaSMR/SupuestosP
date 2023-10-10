package EjerciciosAdicionales;

import java.util.Scanner;

public class ejer11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero min");
        int min = sc.nextInt();
        System.out.println("Escribe el numero max");
        int max = sc.nextInt();

        int bucle = 0;
        int numeros = 1;
        int guardarNumeros = 0;
        int numerosErroneos = 0;
        while(bucle == 0){
            if(min > max){
                System.out.println("Escribe el numero min");
                min = sc.nextInt();
                System.out.println("Escribe el numero max");
                max = sc.nextInt();
            }else{
                    System.out.println("Escriba numeros");
                    numeros = sc.nextInt();
                    if(numeros == 0){
                        break;
                    }
                    if(numeros >= min && numeros <= max){
                        guardarNumeros = guardarNumeros + numeros;
                    }else{
                        numerosErroneos++;
                    }
                    if(numeros == max || numeros == min){
                        System.out.println("El numero introducido esta en los limites");
                    }
                    
                }   
        }
            System.out.println("La suma de los numeros dentro de los intervalos son: " + guardarNumeros);
            System.out.println("Los numeros fueran del intervalo son: " + numerosErroneos);
    }
        
}

