package EjerciciosAdicionales;

public class ejer13 {
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (horas < 24) {
            while (minutos < 60) {
                while (segundos < 60) {
                    // Pausa el programa durante 1 segundo
                    pausarSegundo();

                    segundos++;

                    System.out.println("Tiempo transcurrido: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
                }
                segundos = 0;
                minutos++;
            }
            minutos = 0;
            horas++;
        }
    }

    public static void pausarSegundo() {
        int i = 0;
        while (i < 1000000000) {//1000000000milisegundos = 1segundo
            // Esperar hasta que haya transcurrido aproximadamente 1 segundo
            i++;
        }
    }
}
