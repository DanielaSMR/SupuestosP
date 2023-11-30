package EjerProT8;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String texto = sc.nextLine();
        texto = texto.toLowerCase();
        String[] palabras = texto.split(" ");

        int contA = 0;
        for(int i = 0;i <= palabras.length - 1;i++){
            for(int e = 0; e <= palabras.length;e++)
            if(palabras[e].substring(i) == "a"){
                contA++;
            }
        }

        int contB = 0;
        for(int i = 0;i <= palabras.length - 1;i++){
            for(int e = 0; e <= palabras.length;e++)
            if(palabras[e].substring(i) == "b"){
                contB++;
            }
        }

        int contI = 0;
        for(int i = 0;i <= palabras.length - 1;i++){
            for(int e = 0; e <= palabras.length;e++)
            if(palabras[e].substring(i) == "i"){
                contI++;
            }
        }

        int contO = 0;
        for(int i = 0;i <= palabras.length - 1;i++){
            for(int e = 0; e <= palabras.length;e++)
            if(palabras[e].substring(i) == "o"){
                contO++;
            }
        }

        int contU = 0;
        for(int i = 0;i <= palabras.length - 1;i++){
            for(int e = 0; e <= palabras.length;e++)
            if(palabras[e].substring(i) == "u"){
                contU++;
            }
        }
        
    }
}
