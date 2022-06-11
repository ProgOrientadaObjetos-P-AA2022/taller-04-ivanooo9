
package paquete01;
import paquete01.infest.infest;

public class Ejecutor {
    public static void main(String[] args) {
        
        infest estudiante1 = new infest("Sergio", 9.90, 7.10,
                9.00);
        estudiante1.calcularPromedio();
        System.out.printf("%s\n", estudiante1);
        
        infest estudiante2 = new infest("Carolina", 8.10, 9.00,
                7.90);
        estudiante2.calcularPromedio();
        System.out.printf("%s\n", estudiante2);
    }
}












