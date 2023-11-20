import java.util.Arrays;
import java.util.Scanner;

public class grafico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas barras son?");
        int numBarras = sc.nextInt();

        int [] barras = new int[numBarras];
        int numeroMayor = 0;
        
        System.out.println("Añade los datos");
        for(int i = 0; i < barras.length;i++){
            System.out.println("Dato " + i);
            barras[i] = sc.nextInt();
            int comparador = barras[i];
            if(comparador > numeroMayor){
                numeroMayor = comparador;
            }else{
                numeroMayor = numeroMayor;
            }
        }

        int num = numeroMayor;
        System.out.println(Arrays.toString(barras));

        for(int e = 0;e < numeroMayor;e++){
            for(int filas = 0; filas < barras.length;filas++){
                if(barras[filas] == num || barras[filas] > num){
                    System.out.print("*" + "\t");
                }else{
                    System.out.print("\t");
                }
            }
            num--;
            System.out.println(" ");
        }

        for(int u = 0;u < barras.length;u++){
            System.out.print(barras[u] + "\t");
        }

    }
}
