package EjerciciosBasicos;

public class ejer6Incial {
    
    public static void main(String[] args){
        int b = 23;
        int c = 1;
        int d = 2;
        int x;
        
        x = (b >= 0)? c : d;
        if(x == 1){
            System.out.println("Es positivo");
        }
            else{
                System.out.println("Es negativo");
            }

    }
}
