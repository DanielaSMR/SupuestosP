import java.util.Arrays;
import java.util.Scanner;

public class ejer3 {
    public static int[] eliminarElemento (int[] array, int posicion){
        int [] nuevoArray = new int [array.length-1];
        System.arraycopy(array, 0,nuevoArray, 0,posicion);
        System.arraycopy(array, posicion+1,nuevoArray, posicion,nuevoArray.length-posicion);
        return nuevoArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []num;
        int posicion = 1;

        System.out.println("Cuantos alumnos hay?");
        int alumnos = sc.nextInt();
        num = new String[alumnos];

        for(int i = 0;i < alumnos;i++){
            System.out.println("Escribe el nombre del alumno" + i);
            String nombreAlumnos = sc.nextLine();
            num [i] = nombreAlumnos;
        }

        System.out.println("Quieres borrar un nombre? 1-Si 0-No");
        int borrar = sc.nextInt();

        if(borrar == 1){
            System.out.println("Lista de alumnos" + Arrays.toString(num));
            num = (int) eliminarElemento(num, posicion);
        }else{
            System.out.println("Lista de alumnos" + Arrays.toString(num));
        }




    }
}
