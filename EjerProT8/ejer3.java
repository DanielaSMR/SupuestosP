package EjerProT8;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la primera frase");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();
        String[] palabras = frase.split(" ");

        System.out.println("Escribe la segunda frase");
        String frase2 = sc.nextLine();
        frase2 = frase2.toLowerCase();
        String[] palabras2 = frase.split(" ");

        int cont = 0;

        if(frase.length() == frase2.length()){
            for(int i = 0;i <= palabras.length - 1;i++){
                if(palabras[i].equals(palabras2[i])){
                    cont++;
                }
            }
        }else{
            System.out.println("Una frase es mas larga que la otra");
        }

        if(cont == palabras.length){
            System.out.println("Las frases son iguales");
        }else{
            System.out.println("Las frases no son iguales");
        }
        
    }
}
