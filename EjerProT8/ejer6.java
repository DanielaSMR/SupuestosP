package EjerProT8;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String texto = sc.nextLine();
        texto = texto.toLowerCase();
        texto = texto.replace(" ","");
        char[] frase = new char[texto.length()];
        
        for(int i = 0;i < frase.length;i++){
            frase[i] = texto.charAt(i);
        }
        
        int i = 0;
        int cont = 1;

        for(int e = frase.length - 1; e > 0;e--){
            char alreves = texto.charAt(e);
            if(alreves != frase[i] && cont == 1){
                System.out.println("No es palindromo");
                cont ++;
            }else if(alreves == frase[i] && cont < frase.length - 1){
                cont ++;
            }else if(alreves == frase[i] && cont == frase.length - 1){
                System.out.println("Es palindromo");
            }
            i++;
        }

    }
}
