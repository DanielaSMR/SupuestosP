package desdecero2;
import java.util.Scanner;

public class ejerC3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una letra");
        String letra = sc.nextLine();

        if(esMayuscula(letra)){
            System.out.println("Es mayuscula");//llamamos a la funcion y si es true entonces es mayuscula y si es false pasa al siguiente if el cual sera true
        }
        else if(esMinuscula(letra)){
            System.out.println("Es minuscula");
        }

    }
    public static boolean esMinuscula(String s){
            return s.equals(s.toLowerCase());//convertimos en minuscula la cadena y comparamos la original con la convertida usando equals,la cual regresa un booleano
        }
    public static boolean esMayuscula(String s){
            return s.equals(s.toUpperCase());
    }
}
