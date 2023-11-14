import java.util.Arrays;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe");
        String texto = sc.nextLine();
        int contador = 1;
        
        texto = texto.toLowerCase();

        String[] palabras = texto.split(" ");

        System.out.println(Arrays.toString(palabras));
        Arrays.sort(palabras);
        for(int i = 0; i < palabras.length - 1; i++){
            if (!palabras[i + 1].equals(palabras[i])){
                contador = contador + 1;
            }
        }

        System.out.println(contador);
    }
}
