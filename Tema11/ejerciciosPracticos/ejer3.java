package Tema11.ejerciciosPracticos;

import java.util.Scanner;

public class ejer3 {

    public static String funcionBorrar(String p, int x){
        if(x == 0){
            System.out.println(p.charAt(0));
        }else{
            //System.out.println(p.charAt(0));
            //System.out.println(p.length());
            System.out.print(p.charAt(p.length() - 1));
            //return funcionBorrar(p, x - 1);
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
            for(int a = 0;a <= x;a++){
                System.out.println(funcionBorrar(palabra, x) + "\t");
            }
            x--;
        }
    }
}
