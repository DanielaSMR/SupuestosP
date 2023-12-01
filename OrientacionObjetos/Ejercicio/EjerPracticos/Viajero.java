package OrientacionObjetos.Ejercicio.EjerPracticos;

public class Viajero {

    private String DNI;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String direccion;

    

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }
}
