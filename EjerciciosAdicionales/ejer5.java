package EjerciciosAdicionales;
import java.util.HashMap;
import java.util.Scanner;
import java.math.*;
public class ejer5 {

        public static double numerosRandoms(double min, double max){
            min = Math.ceil(min);
            max = Math.floor(max);
            return Math.floor(Math.random() * (max - min + 1) + min);
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Escriba un numero");
            int num1 = sc.nextInt();
            System.out.println("Escribe otro numero");
            int num2 = sc.nextInt();

            if(num1 > num2){
                int y = (int) (Math.floor(Math.random()*(num1 - num2 + 1)+ num2));
                System.out.println(y);
            }else{
                int y = (int) (Math.floor(Math.random()*(num2 - num1 + 1)+ num1));
                System.out.println(y);
            }
        }
    }