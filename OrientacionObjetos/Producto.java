package OrientacionObjetos;

public class Producto {
    static float rebaja;
    float precio;
    float precioTotal;

    Producto (float precio){
        rebaja = 0;
        this.precio = precio;   
    }    

    public static void infoRebajaActual(){
        System.out.println("rebajaActual : " + rebaja + "%");

    }

    public float getPrecioFinal(){
        if(rebaja != 0){
            precioTotal = (precio - (precio*rebaja/100));

        }else{
            precioTotal = precio;
        }
        return precioTotal;
    }


    
}
