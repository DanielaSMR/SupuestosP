package ejerciciosPropuestos;
import java.util.*;


public class ejercicio11 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad");
        int dinero = sc.nextInt();

        int B500 = dinero/500;
        dinero = dinero - 500 * B500;
        int B200 = dinero/200;
        dinero = dinero - 200 * B200;
        int B100 = dinero/100;
        dinero = dinero - 100 * B100;
        int B50 = dinero/50;
        dinero = dinero - 50 * B50;
        int B20 = dinero/20;
        dinero = dinero - 20 * B20;
        int B10 = dinero/10;
        dinero = dinero - 10 * B10;
        int B5 = dinero/5;
        dinero = dinero - 5 * B5;
        int M2 = dinero/2;
        dinero = dinero - 2 * M2;
        int M1 = dinero/1;
        dinero = dinero - 1 * M1;

        System.out.println(B500 + " billete/s de 500");
        System.out.println(B200 + " billete/s de 200");
        System.out.println(B100 + " billete/s de 100");
        System.out.println(B50 + " billete/s de 50");
        System.out.println(B20 + " billete/s de 20");
        System.out.println(B10 + " billete/s de 10");
        System.out.println(B5 + " billete/s de 5");
        System.out.println(M2 + " moneda/s de 2");
        System.out.println(M1 + " moneda/s de 1");

    }
}
