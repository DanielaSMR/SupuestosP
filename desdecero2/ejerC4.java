package desdecero2;

import java.util.Scanner;

public class ejerC4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}
