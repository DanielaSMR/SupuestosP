package practica;

public class ejer3 {
    public static void main(String[] args) {
        int numLineas = 5;

        for(int f = 1;f <= numLineas; f++){
            for(int cb = 1; cb <= numLineas-f;cb++){
                System.out.print(" " + "\t");
            }
            for(int cn = 1; cn <= (f * 2) - 1;cn++){
                System.out.print(triangulo(f, cn) + "\t");
            }
            System.out.println();
        }
    }

    public static Integer triangulo(int f,int c){
        if(f == 1){
            return 1;
        }
        if(c == 1){
            return 1;
        }
        if (c == f*2 - 1) {
            return 1;
        }else if(f == 2 && c == 2){
            return 1;
        }else if(c == 2){
            return triangulo(f - 1, c - 1) + triangulo(f - 1, c);

        }else if(c == f * 2 - 2){
            return triangulo(f - 1, c - 1) + triangulo(f - 1, c - 2);

        }else{
            return triangulo(f - 1, c - 1) + triangulo(f - 1, c - 2) + triangulo(f - 1, c);
        }
    }
}
