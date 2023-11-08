package EjerPraT8;

import java.util.Arrays;

public class ejer2 {
    public static void main(String[] args) {
        int []num;
        num = new int[100];
        int suma = 0;
        int comparar = 0;
        int comparar2 = 0;
        int guardarNumMayor = 0;
        int guardarNumMenor = 90;

        for(int i = 0;i < 100;i++){
            num [i] = (int) (Math.random()*71+10);
            suma = suma + num[i];
            comparar = num[i];
            comparar2 = num[i];
            if(comparar > guardarNumMayor){
                guardarNumMayor = comparar;
            }
            if(comparar2 < guardarNumMenor){
                guardarNumMenor = comparar2;
            }
        }

        System.out.println(guardarNumMayor);
        System.out.println(guardarNumMenor);
        System.out.println(suma / 100);
        //int maximo = Math.max(num[0], num[100]);
        //System.out.println(maximo);
    }
}
