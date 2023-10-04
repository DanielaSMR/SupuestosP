package desdecero2;

import java.util.Scanner;

public class ejerC9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe las horas");
        int hora = sc.nextInt();
        System.out.println("Escribe los minutos");
        int minutos = sc.nextInt();
        System.out.println("Escribe los segundos");
        int segundos = sc.nextInt();

        if(hora <= 24 && minutos <= 59 && segundos <= 59){
            System.out.println("La hora es " + hora + ":" + minutos + ":" + segundos);
        }else{
            System.out.println("Hora no valida");
        }
    }
}
