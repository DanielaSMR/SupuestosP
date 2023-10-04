package desdecero2;

import java.util.Scanner;

public class ejerC7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = sc.nextInt();

        if(num1 > 0 && num2 > 0){
            int divi = num1 / num2;
        }else{
            System.out.println("error");
        }

    }
}
