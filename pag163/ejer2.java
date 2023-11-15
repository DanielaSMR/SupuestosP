package pag163;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        System.out.println("Escribe un DNI:");
        String DNI = sc.nextLine();
        int suma = 0;
  

        if(DNI.length() == 8){
            for(int i = 0;i <= 7; i++){
                if (DNI.substring(i) != {1,2,3,4,5,6,7,8,9} ) {
                }
            }
            int DNINum = Integer.parseInt(DNI.substring(0, 8));
            int division = DNINum % 23;
            if(division <= 22){
                if(DNI.substring(8).equals(letra[division])) {
                   System.out.println("Es valido");  
                }else{
                    System.out.println("No valido");
                }
            }
        }else{
            System.out.println("No es correcto");
        }


    }
}
