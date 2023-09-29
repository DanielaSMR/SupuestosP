package ejerciciosPropuestos;
import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe los segundos");
        int t = sc.nextInt();
        double horas = (double) t/3600;
        double minutos = horas * 60;
        System.out.println("Son" + " " + horas + " " + "horas");
        System.out.println("Son" + " " + minutos + " " + "minuros");
    }
}
