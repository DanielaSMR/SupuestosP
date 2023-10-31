import java.util.Arrays;

public class ejer2 {
    public static void main(String[] args) {
        int []num;
        num = new int[100];
        int suma = 0;

        for(int i = 0;i < 100;i++){
            num [i] = (int) (Math.random()* 999);
            suma = suma + num[i];
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("Suma total " + suma);

    }
}
