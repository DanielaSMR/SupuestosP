package ejerciciosPropuestos2;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero");
        int num = sc.nextInt();
        int resto;
        int invertido = 0;

        if(num%1 == 0 && num%num == 0){
            while(num > 0){
                resto = num % 10;
                invertido = invertido * 10 + resto;
                num /= 10;
            }
            if(invertido%1 == 0 && invertido%invertido == 0){
                System.out.println("Tu numero es Omrip");
            }else{
                System.out.println("Es primo pero no es Omirp");
            }
        }else{
            System.out.println("no es un numero primo");
        }

    }
}
