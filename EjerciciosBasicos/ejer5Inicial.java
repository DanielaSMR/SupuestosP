package EjerciciosBasicos;
import java.util.*;
import java.math.*;

public class ejer5Inicial {
    
    public static void main(String[] args){
        int a = 4;
        int b = a %= 2;
        int c = 1;
        int d = 2;
        int x;
        
        x = (b == 0)? c : d;
        if(x == 1){
            System.out.println("Es par");
        }
            else{
                System.out.println("Es impar");
            }

    }
}
