package EjerPraT8;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dato = sc.nextInt();
        System.out.println(esCapicua(dato));
        //no funcionaba ya que si comparas dos String no se puede poner == si no .equals()

    }

    public static boolean esCapicua(int dato){
        Integer i = Integer.valueOf(dato);
        String opu = new StringBuffer(i.toString()).reverse().toString();
        if(i.toString().equals(opu.toString()))
            return true;
        else{
            return false;
        }
    }
        
}
