package EjerPraT8;

import java.util.Arrays;

public class ejer8 {
    public static void main(String[] args) {
        String cadena = "Sergio\n8.5\nMario\n4.9\nPedro\n3.8\nAndrés\n6.3";

        String [] palabras = cadena.split("\n");
        String [] nombres = new String[palabras.length/2];
        Double [] notas = new Double[palabras.length/2];

        
    for(int i = 0;i < palabras.length; i++){
        if(i%2==0){
            nombres[i/2] = palabras[i];
        } else {
            notas[i/2] = Double.parseDouble(palabras[i]);
        }
    }

    for(int e = 0; e < nombres.length; e++){
        System.out.println(nombres[e] + " ha sacado un " + notas[e]);
    }

        
    }
}
