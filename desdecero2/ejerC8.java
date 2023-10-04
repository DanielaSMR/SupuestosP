package desdecero2;

import java.util.Scanner;

public class ejerC8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Escribe el tercer numero");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("El"  + num1 + " es el mayor");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El " + num2 + " es el mayor");
        }else{
            System.out.println("El " + num3 + " es el mayor");
        }
    }
}
