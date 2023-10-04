package ejerciciosPracticos;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe lo que quieras y termina cuando escribar FIN");
        String texto = args[0];

        while(texto.contains("FIN")){
            break;
        }        

    }
}
