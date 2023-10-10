package EjerciciosAdicionales;

import java.util.Scanner;

public class ejer10 {
    public static double numerosRandoms(double min, double max){
            min = Math.ceil(min);
            max = Math.floor(max);
            return Math.floor(Math.random() * (max - min + 1) + min);
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int y = (int) (Math.floor(Math.random()*(1 - 100 + 1)+ 100));
            System.out.println(y);
            System.out.println("Adivina el numero");
        
            for(int i = 0; i < 10; i++){
                System.out.println("\n" + "Escriba el numero");
                int num = sc.nextInt();
                int intentos = 1;
                intentos = intentos + 1;
        
                if(num < y){
                    System.out.println("El numero es menor");
                }else if(num > y){
                    System.out.println("El numero es mayor");
                }else if(num == y){
                    System.out.println("Es el numero correcto");
                    System.out.println("Lo acertas en: " + intentos + " intentos");
                    break;
                }
            }
            System.out.println("El numero era" + y);
        }
}
