import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el tamaño del cuadrado");
        int alturaMax = sc.nextInt();

        for(int f = 1;f <= alturaMax;f++){
            for(int c = 1;c <= alturaMax;c++){
                System.out.print(cuadrado(f, c,alturaMax) + "\t");
            }
            System.out.println();
        }

    }

    public static Integer cuadrado(int f,int c,int max){
        if(f == 1){
            return 1;
        }
        if(c == 1){
            return 1;
        }
        if(f == max){
            return 1;
        }
        if(c == max){
            return 1;
        }else
            return 0;
    }
}
