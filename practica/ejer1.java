package practica;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero del cual quieres el factorial");
        int num = sc.nextInt();
        factorial_recursiva(num, num);
        factorial_iterativo(num);

    }

    public static Integer factorial_recursiva(int num, int resultado){
        if(num == 1){
            return resultado;
        }
        if(num == resultado){
            num--;
            resultado = num * resultado;
            System.out.println(resultado);
            factorial_recursiva(num - 1, resultado);
        }else{
            resultado = num * resultado;
            System.out.println(resultado);
            factorial_recursiva(num - 1, resultado);
        }
        return 0;
    }

    public static Integer factorial_iterativo(int num){
        int resultado = num;
        for(int i = 0; i <= num;i++){
            if(num == num){
                num--;
            }
            resultado = resultado * num;
            System.out.println(resultado);
        }
        return 0;
    }
}
