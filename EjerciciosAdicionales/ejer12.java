package EjerciciosAdicionales;

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Escribe el precio");
        //int precioTotal = sc.nextInt();
        System.out.println("Escribe el plazo para pagarlo en meses");
        int plazo = sc.nextInt();
        int precioInicial = 10;
        int calculo = precioInicial;
        int pagoTotal = 0;

        System.out.println(precioInicial);
        for(int i = 0;i <= plazo;i++){
            calculo = calculo * 2;
            System.out.println(calculo);
            pagoTotal = pagoTotal + calculo;
        }
        System.out.println("El pago total es: " + pagoTotal);

    }
}
