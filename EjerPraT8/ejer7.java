package EjerPraT8;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dato = sc.nextInt();
        esCapicua(dato);

    }

    public static boolean esCapicua(int dato){
        Integer i = Integer.valueOf(dato);
        String opu = new StringBuffer(i.toString()).reverse().toString();
        return i.toString() == opu.toString();
    }
        
}
