package EjerciciosAdicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Que deseas hacer con el numero? +/-/*/ / /^/%");
        String signoAritmetico = sc.nextLine();
        String signoAritmetico2 = sc.nextLine();
        int tipoMensaje;
        String mensaje;
        if(signoAritmetico2.equals("+")){
            JOptionPane.showMessageDialog(null, num1 + num2,"suma",JOptionPane.INFORMATION_MESSAGE);
        }else if(signoAritmetico2.equals("-")){
            JOptionPane.showMessageDialog(null,num1-num2,"resta",JOptionPane.INFORMATION_MESSAGE);
        }else if(signoAritmetico2.equals("*")){
            JOptionPane.showMessageDialog(null,num1*num2,"multiplicacion",JOptionPane.INFORMATION_MESSAGE);
        }else if(signoAritmetico2.equals("^")){
            int elevado = (int) Math.pow(num1, num2);
            JOptionPane.showMessageDialog(null,elevado,"elevado",JOptionPane.INFORMATION_MESSAGE);
        }else if(signoAritmetico2.equals("/")){
            JOptionPane.showMessageDialog(null,num1/num2,"division",JOptionPane.INFORMATION_MESSAGE);
        }else if(signoAritmetico2.equals("%")){
            JOptionPane.showMessageDialog(null,num1%num2,"resto",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"error","error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
