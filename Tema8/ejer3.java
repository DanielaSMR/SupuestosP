import java.util.Arrays;
import java.util.Scanner;

public class ejer3 {
    public static String[] eliminarElemento (String[] array, int posicion){
        Scanner scCambio = new Scanner(System.in);
        String[] nuevoArray = new String [array.length-1];
        System.arraycopy(array, 0,nuevoArray, 0,posicion-1);
        
        System.out.println("Nuevo nombre: ");
        array[array.length-1] = scCambio.nextLine();

        System.arraycopy(array, posicion+1,nuevoArray, posicion,nuevoArray.length-posicion);
        
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []nombre;

        System.out.println("Cuantos alumnos hay?");
        int alumnos = sc.nextInt();
        nombre = new String[alumnos];

        for(int i = 0;i < alumnos;i++){
            System.out.println("Escribe el nombre del alumno" + i);
            String nombreAlumnos = sc.next();
            nombre [i] = nombreAlumnos;
        }

        for(int e = 0;e < alumnos;e++){
            System.out.println("Nombre " + e + " : " + nombre[e] );
        }

        System.out.println("Quieres borrar un nombre? 1-Si 0-No");
        int borrar = sc.nextInt();

        if(borrar == 1){
            System.out.println("Cual quieres borrar?");
            int nombreBorrado = sc.nextInt();
            nombre = eliminarElemento(nombre, nombreBorrado);

            for(int e = 0;e < alumnos;e++){
                System.out.println("Nombre " + e + " : " + nombre[e] );
            }

        }else{
            
        }




    }
}
