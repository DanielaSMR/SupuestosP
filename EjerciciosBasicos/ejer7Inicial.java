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


        x = (b == 0)? e : d;
        if(x == 1){
            System.out.println("Es par");
        }
            else{
                System.out.println("Es impar");
            }

        y = (c >= 0)? e : d;
        if(y == 1){
            System.out.println("Es positivo");
        }
            else{
                System.out.println("Es negativo");
            }

        z = (c >= 100)? e : d;
        if(z == 1){
            System.out.println("Es mayor o igual que 100");
        }
            else{
                System.out.println("Es menor que 100");
            }

        v = (a == 0)? e : d;
        if(v == 1){
            System.out.println("Es multiplo de 5");
        }
            else{
                System.out.println("No es multiplo de 5");
            }
        
        g = (f == 0)? e : d;
        if(g == 1){
            System.out.println("Es multiplo de 10");
        }
            else{
                System.out.println("No es multiplo de 10");
            }
    }
}
