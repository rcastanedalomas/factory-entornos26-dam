import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuUtilidades {

    public static void ejecutar(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ UTILIDADES ---");
            System.out.println("1) Invertir texto");
            System.out.println("2) Contar vocales");
            System.out.println("3) ¿Es palíndromo?");
            System.out.println("4) Celsius a Fahrenheit");
            System.out.println("5) Segundos desde fecha (AAAA-MM-DD HH:MM)");
            System.out.println("0) Volver");

            opcion = Entrada.leerEntero(sc, "Opción: ");

            if (opcion == 1) {
                String t = Entrada.leerTexto(sc, "Texto: ");
                System.out.println(Cadenas.invertir(t));
            } else if (opcion == 2) {
                String t = Entrada.leerTexto(sc, "Texto: ");
                System.out.println("Vocales = " + Cadenas.contarVocales(t));
            } else if (opcion == 3) {
                String t = Entrada.leerTexto(sc, "Texto: ");
                System.out.println("Palíndromo = " + Cadenas.esPalindromo(t));
            } else if (opcion == 4) {
                double c = Entrada.leerDouble(sc, "Celsius: ");
                System.out.println("F = " + Conversiones.celsiusAFahrenheit(c));
            } else if (opcion == 5) {
                LocalDateTime dt = Entrada.leerFechaHoraSimple(sc, "Fecha y hora (AAAA-MM-DD HH:MM): ");
                long s = Fechas.segundosDesde(dt);
                System.out.println("Segundos = " + s);
                System.out.println("Formateado = " + Fechas.formatearSegundos(s));
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}
