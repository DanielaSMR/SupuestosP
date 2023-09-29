package ejerciciosPropuestos;
import java.util.*;

public class joven{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la edad");
        int edad = sc.nextInt();

        System.out.println("Escribe el nivel de estudios");
        int nivel_de_estudios = sc.nextInt();

        System.out.println("Escribe los ingresos");
        int ingresos = sc.nextInt();

        boolean jasp = (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28.000);

        System.out.println(jasp);
    }


}

