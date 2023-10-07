package ejerciciosResueltos;

public class ejer4 {
    public static void main(String[] args) {
        int alturaMax = 3;
        int nFinal = (alturaMax * 2) + 1; 
        int espaciosPrimer = nFinal / 2;
        int nS = 1;
        
        while(alturaMax > 0){
                for(int x = espaciosPrimer; x > 0; x--){
                System.out.print(" ");
                }
                for(int y = nS ;y > 0; y--){
                System.out.print("N");
                }
                nS = nS + 2;
                espaciosPrimer -= 1;
                alturaMax = alturaMax - 1;
                System.out.print("\n");
        }
    }
}
