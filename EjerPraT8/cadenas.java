package EjerPraT8;

import java.util.Arrays;

public class cadenas {
    public static void main(String[] args) {
        String cad1 = "Pepe";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);

        int numCad1 = cad1.length();
        int numCad2 = cad2.length();
        int numCad3 = cad3.length();

        System.out.println(cad1 + " " + numCad1);
        System.out.println(cad2 + " " + numCad2);
        System.out.println(cad3 + " " + numCad3);

        cad1 = cad1 + cad2;
        System.out.println(cad1);
        System.out.println(String.valueOf(cad1));

        System.out.println(cad2.compareTo(cad3));
        System.out.println(cad1.compareTo(cad3));
        System.out.println(cad2.compareTo(cad1));

        if(cad2.equals(cad3)){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }

        if(cad1.equals(cad3)){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }

        System.out.println(cad1);
        System.out.println(cad2.toLowerCase());
        System.out.println(cad3.toUpperCase());

        String nombre = " Daniela ";
        System.out.println(nombre.trim());

        cad1 = cad1.replace("e", "a");
        /*System.out.println(cad1.replace("e", "a"(subtring(4))));*/

        System.out.println(cad1.startsWith("D"));
        System.out.println(cad2.endsWith("l"));

        System.out.println(cad1.charAt(4));

        System.out.println(cad1.indexOf("a"));
        System.out.println(cad1.lastIndexOf("a"));

        int[] vector;
        vector = new int[cad1.length()];
        System.out.println(vector.toString());

    }
}
