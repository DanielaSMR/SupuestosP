package EjerProT8;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe lo que quieras");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");

        for(int i = 0;i <= frase.length();i++){
            System.out.println(palabras[i]);
        }
    }
}
