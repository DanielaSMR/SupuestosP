package EjerciciosBasicos;

import java.util.Scanner;

public class ejer11Estru {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero de 5 cifras");
        int num = sc.nextInt();//12345
        int a = num%10;//5
        int b = num/10;//1234
        int d = b%10;//4
        int c = b/10;//123
        int e = c%10;//3
        int f = c/10;//12
        int g = f%10;//2
        int h = f/10;//1

        System.out.println(h);
        System.out.println(g);
        System.out.println(e);
        System.out.println(d);
        System.out.println(a);
}
}

