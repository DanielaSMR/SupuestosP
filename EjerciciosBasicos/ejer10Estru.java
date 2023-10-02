package EjerciciosBasicos;

import java.util.Scanner;

public class ejer10Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero de 3 cifras");
        int num = sc.nextInt();//123
        int a = num%10;//3
        int b = num/10;//12
        int d = b%10;//2
        int c = b/10;//1

        System.out.println(c);
        System.out.println(d);
        System.out.println(a);
    }
    
}
