package EjerciciosBasicos;

public class ejer7Inicial {
    public static void main(String[] args){
        int c = 15;
        int num1 = c;
        int num2 = c;
        int b = c %= 2;
        int a = num1 %= 5;
        int f = num2 %= 10;
        int e = 1;
        int d = 2;
        int x, y, z, v, g;


        System.out.println(b == 0 ? "Es par" : "Es impar");

        System.out.println(c >= 0 ? "Es positivo" : "Es negativo");

        System.out.println(c > 100 ? "Es mayor que 100" : "Es menos que 100");

        System.out.println(a == 0? "Es multiplo de 5" : "No es multiplo de 5");
        
        System.out.println(f == 0 ? "Es multiplo de 10" : "No es multiplo de");
    }
}
