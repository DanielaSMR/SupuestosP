package Tema11.ejerciciosPracticos;

import java.util.Scanner;

public class ejer3 {

    public static String funcionBorrar(String p, int x){
        if(x == 0){
            System.out.println(p.charAt(0));
        }else{
            System.out.println(p.substring(0, x));
        }
        return " ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe lo que quieras");
        String palabra = sc.nextLine();
        String y = palabra;
        int x = y.length();
        funcionBorrar(palabra, x);

        for(int i = 1;i <= y.length();i++){
            System.out.println(funcionBorrar(palabra, x) + "\t");
            x--;
        }
    }
}
