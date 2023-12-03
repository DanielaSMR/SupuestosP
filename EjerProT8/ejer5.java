package EjerProT8;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String texto = sc.nextLine();
        texto = texto.toLowerCase();

        int contA = 0;
        int contE = 0;
        int contI = 0;      
        int contO = 0;
        int contU = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            switch (caracter) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
            }
        }

        System.out.println("Número de A's: " + contA);
        System.out.println("Número de E's: " + contE);
        System.out.println("Número de I's: " + contI);
        System.out.println("Número de O's: " + contO);
        System.out.println("Número de U's: " + contU);
    }
        
}
