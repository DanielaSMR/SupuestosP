package ejerciciosPropuestos2;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int a = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int b = sc.nextInt();
        System.out.println("Escribe el tercer numero");
        int c = sc.nextInt();

        if(a > b && a > c){
            if(b > c){
                System.out.println(a + "," + b + "," + c);
            }
            else{
                System.out.println(a + "," + c + "," + b);
            }
        }
        else if(b > a && b > c){
             if(a > c){
                System.out.println(b + "," + a + "," + c);
            }
            else{
                System.out.println(b + "," + c + "," + a);
            }
        }
        else{
             if(a > b){
                System.out.println(c + "," + a + "," + b);
            }
            else{
                System.out.println(c + "," + b + "," + a);
            }
        }
    }
}
