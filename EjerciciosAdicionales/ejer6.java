package EjerciciosAdicionales;

public class ejer6 {
    public static void main(String[] args) {
        int num = 1;
        while(num < 101){
            if(esPrimo(num)){
                System.out.println(num);
            }
            num = num + 1;
        }
    }

    public static boolean esPrimo(int numero){
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
    }
}
