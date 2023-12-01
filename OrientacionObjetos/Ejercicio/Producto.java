package OrientacionObjetos.Ejercicio;

public class Producto {
    static float rebaja;
    float precio;

    Producto (float precio){
        rebaja = 0;
        this.precio = precio;   
    }    

    public static void infoRebajaActual(){
        System.out.println("rebajaActual : " + rebaja + "%");

    }

    public float getPrecioFinal(){
        if(rebaja != 0){
            return (precio - (precio*rebaja/100));

        }else{
            return precio;
        }
    }


    
}
