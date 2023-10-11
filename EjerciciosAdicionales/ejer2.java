package EjerciciosAdicionales;

import java.util.Scanner;

public class ejer2 {

    //public static resultado(numero){

    //}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bucle = 0;
        int numeroVeces = 0;

        int media = 0;

        int comparar = 0;
        int comparar2 = 0;
        int guardarNum = 0;
        int guardarNumMenor = 0;
        int guardarNumMayor = 0;

        int compararPositivos = 0;
        int compararNegativos = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        int guardarNegativos = 0;
        int guardarPositivos = 0;

        int guardarPares = 0;
        int guardarImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        while(bucle != 1){

            System.out.println("Escribe un numero");
            int num = sc.nextInt();

            media = media + num;

            comparar = num;
            comparar2 = num;

            if(comparar > guardarNumMayor && numeroVeces != 0){
                comparar = guardarNumMayor;
            }else if(numeroVeces != 0){
                guardarNumMayor = guardarNumMayor;
            }


           if(comparar2 < guardarNumMenor && numeroVeces != 0){
                comparar = guardarNumMenor;
            }else if(numeroVeces != 0){
                guardarNumMenor = guardarNumMenor;
            }

            if(numeroVeces == 0){
                guardarNumMayor = comparar;
                guardarNumMenor = comparar2;
            }

            if(num < 0 ){
                guardarNegativos = guardarNegativos + num;
                contadorNegativos +=1;
            }else{
                contadorPositivos +=1;
            }

            if(num%2 == 0){
                guardarPares = guardarPares + num;
                contadorPares +=1;
            }else{
                guardarImpares = guardarImpares + num;
                contadorImpares +=1;
            }

            System.out.println("Quieres poner otro numero?Si(0)/No(1)");
            bucle = sc.nextInt();

            numeroVeces +=1;
        
        }
        System.out.println("La media de todos los numero es: " + media/numeroVeces);

        System.out.println("El numero mas grande de todos es: " + guardarNumMayor);
        System.out.println("El numero mas pequeño de todos: " + guardarNumMenor);

        System.out.println("La suma de todos los negativos: " + guardarNegativos);
        System.out.println("La suma de todos los positivos es: " + media);

        System.out.println("Han aparecido " + contadorNegativos + " numeros negativos");
        System.out.println("Han aparecido " + contadorPositivos + " numeros positivos");

        System.out.println("La suma de todos los impares: " + guardarImpares);
        System.out.println("La suma de todos los pares: " + guardarPares);
        
        System.out.println("Han aparecido " + contadorImpares + " numeros impares");
        System.out.println("Han aparecido: " + contadorPares + " numeros pares");
    }
    
    
}
