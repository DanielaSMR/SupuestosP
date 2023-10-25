package Tema11.ejerciciosPracticos;

public class ejer1 {
    public static void romper(int n){
            System.out.println(n);
            romper(n + 1);
    }
    public static void main(String[] args) {
        int n = 1;
        romper(n);

    }
}
