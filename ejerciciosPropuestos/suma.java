package ejerciciosPropuestos;

public class suma {
        static int n1 = 50;
            public static void main (String[] args) {
                int n2 = 30, suma = 0, n3;
                suma = n1 + n2;
                System.out.println("LA SUMA ES:"+ suma);
                n3 = 0;
                suma = suma + n3;
                System.out.println(suma);
            }
}
//El error era que no estaba definido el n3