package desdecero2;

import java.util.Scanner;

public class ejerC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int num = sc.nextInt();

        if(num >= 0 && num <=9){
            System.out.println("Esta entre 0 y 9");
        }else{
            System.out.println("Esta fuera del rango");
        }
    }
}
