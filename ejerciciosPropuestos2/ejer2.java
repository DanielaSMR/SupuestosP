package ejerciciosPropuestos2;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como de alta quieres la piramide?");
        int alturaMax = sc.nextInt();
        int nFinal = (alturaMax * 2) + 1;
        int nS = 1;
        
        while(alturaMax > 0){
                for(int y = nS ;y > 0; y--){
                System.out.print("N");
                }
                nS = nS + 2;
                alturaMax = alturaMax - 1;
                System.out.print("\n");
        }

    }
}
