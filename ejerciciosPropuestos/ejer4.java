package ejerciciosPropuestos;

public class ejer4 {
    public static void main (String[] args) {
        int num = 5;
        num += num - 1 * 4 + 1;
        System.out.println(num);
        num = 4;
        num %= 7 * num % 3 * 7 >> 1;
        System.out.println(num);
    }
}
//una vez corregido los 3 errores el resultado sera 7 y 1
