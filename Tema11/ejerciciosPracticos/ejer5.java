package Tema11.ejerciciosPracticos;

import java.util.Scanner;

public class ejer5 {

    public static Integer division(int n, int m, int cont){
        if(n <= 0){
            return 0;
        }else{
            n = n - m;
            int contador = cont + 1;
            if(n <= 0){
                System.out.println(contador);
            }
            return division(n, m, contador);
        }

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Escribe los numeros que quieres dividir");
        int n = sc.nextInt();
        int m = sc.nextInt();
        division(n, m, 0);
    }
}
