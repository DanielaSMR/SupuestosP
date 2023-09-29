package ejerciciosPropuestos;
import java.util.HashMap;
import java.math.*;

public class ejer8 {

    public static double numerosRandoms(double min, double max){
        min = Math.ceil(min);
        max = Math.floor(max);
        return Math.floor(Math.random() * (max - min)+ min);
    }

    public static void main(String[] args){

            HashMap<Integer,String>map=new HashMap<>();{

                map.put(1,"a");
                map.put(2,"b");
                map.put(3,"c");
                map.put(4,"d");
                map.put(5,"e");
                map.put(6,"f");
                map.put(7,"g");
                map.put(8,"h");
                map.put(9,"i");
                map.put(10,"j");
                map.put(11,"k");
                map.put(12,"l");
                map.put(13,"m");
                map.put(14,"n");
                map.put(15,"o");
                map.put(16,"p");
                map.put(17,"q");
                map.put(18,"r");
                map.put(19,"s");
                map.put(20,"t");
                map.put(21,"u");
                map.put(22,"v");
                map.put(23,"w");
                map.put(24,"x");
                map.put(25,"y");
                map.put(26,"z");
            }

        double x = numerosRandoms(1, 26);
        int y = (int) Math.round(x);
        if (y == 1 || y == 5 || y == 9 || y == 15 || y == 21){
            System.out.println("Es una vocal");
        }
        else{
            System.out.println("Es una consonante");
        }

        System.out.println(map.get(y));



        }

    }
