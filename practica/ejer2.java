package practica;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero para el fibonacci");
        int num = sc.nextInt();

        fibonacci_recursiva(num, 0, 0);
    }

    public static Integer fibonacci_recursiva(int num,int numActual,int numeroAnterior){
        if(numActual == 0){
            System.out.println(0);
            return fibonacci_recursiva(num - 1, numActual + 1, numeroAnterior);
        }
        if(num == 0){
            return 0;
        }else if(numActual == 1){
            System.out.println(1);
            System.out.println(1);
            numeroAnterior = numActual;
            return fibonacci_recursiva(num - 2, numActual + 1, numeroAnterior);
        }else{
            System.out.println(numActual);
            int guardarNum = numActual;
            numActual = numActual + numeroAnterior;
            numeroAnterior = guardarNum;
            return fibonacci_recursiva(num - 1, numActual , numeroAnterior);
        }
    }
}
