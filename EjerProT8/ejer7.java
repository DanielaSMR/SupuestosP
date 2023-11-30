package EjerProT8;

import java.util.Arrays;
import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int primerNum = sc.nextInt();
        int []num = new int[primerNum];

        num [0]= primerNum;

        System.out.println("Escribe el segundo numero");
        int segunNum = sc.nextInt();
        int []numDos = new int[segunNum];

        numDos [0]=segunNum;

        String []suma;

        if(num[0] > numDos[0]){
            suma = new String[primerNum];
            suma [0] = primerNum + " " + segunNum;
        }else{
            suma = new String[segunNum];
            suma [0] = segunNum + " " + primerNum;
        }

        System.out.println(suma[0]);

    }
}
