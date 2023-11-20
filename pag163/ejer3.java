package pag163;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto");
        String texto = sc.nextLine();
        System.out.println("Escribe que palabra buscas");
        String buscar = sc.nextLine();

        String[] palabras = texto.split(" ");
        int cont = 0;

        for(int i = 0;i < palabras.length;i++){
            if(buscar.equals(palabras[i])){
                cont = cont + 1;
            }
        }
        System.out.println(buscar + " aparece " + cont + " veces ");
    }
}
