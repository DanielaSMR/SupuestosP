package practica;

import java.util.Scanner;

public class ejer4 {
    public static void muestraCifra(int dat) {
        if (dat < 10) {
            System.out.print(dat);
        } else {
            dat = dat - 10;
            char c = (char) ('A' + dat);
            System.out.print(c);
        }
    }

    public static void transforma(int dato, int base) {
        if (base > dato) {
            muestraCifra(dato);
        } else {
            transforma(dato / base, base);
            muestraCifra(dato % base);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, base;
        System.out.println("Introduce el número decimal: ");
        num = teclado.nextInt();
        System.out.println("Introduce a qué base quieres pasarlo: ");
        base = teclado.nextInt();
        transforma(num, base);
    }
}
