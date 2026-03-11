import java.time.LocalDateTime;
import java.util.Scanner;

public class Entrada {

    public static int leerEntero(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Introduce un entero válido. ");
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }
    
    public static int leerEnteroEnRango(Scanner sc) {

        boolean minMax = false;
        int min = 0;
        int max = 0;
        int num = 0;

        while (!minMax) {

            System.out.print("Introduce el mínimo del rango: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: debes introducir un número entero...");
                sc.next(); 
                System.out.print("Introduce el mínimo del rango: ");
            }
            min = sc.nextInt();

            System.out.print("Introduce el máximo del rango: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: debes introducir un número entero...");
                sc.next();
                System.out.print("Introduce el máximo del rango: ");
            }
            max = sc.nextInt();

            if (min > max) {
                System.out.println("El rango (" + min + ") - (" + max + ") es incorrecto...");
            } else {
                minMax = true;
            }
        }

        boolean dentroRango = false;

        while (!dentroRango) {

            System.out.print("Introduce un número dentro del rango (" + min + ") - (" + max + "): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: debes introducir un número entero...");
                sc.next();
                System.out.print("Introduce un número dentro del rango (" + min + ") - (" + max + "): ");
            }
            num = sc.nextInt();

            if (num < min || num > max) {
                System.out.println("El número no está dentro del rango...");
            } else {
                dentroRango = true;
            }
        }

        return num;
    }

    public static double leerDouble(Scanner sc, String msg) {
        System.out.print(msg);

        while (true) {
            String texto = sc.nextLine().trim();

            // Permitir coma o punto como separador decimal
            texto = texto.replace(",", ".");

            try {
                double v = Double.parseDouble(texto);
                return v;
            } catch (NumberFormatException e) {
                System.out.print("Introduce un número válido. " + msg);
            }
        }
    }


    public static String leerTexto(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    // Formato simple: "AAAA-MM-DD HH:MM" (sin validaciones finas)
    public static LocalDateTime leerFechaHoraSimple(Scanner sc, String msg) {
        String s = leerTexto(sc, msg).trim();
        if (s.length() < 16) return null;

        String fecha = s.substring(0, 10);
        String hora = s.substring(11, 16);

        int y = parseIntSeguro(fecha.substring(0, 4));
        int m = parseIntSeguro(fecha.substring(5, 7));
        int d = parseIntSeguro(fecha.substring(8, 10));

        int hh = parseIntSeguro(hora.substring(0, 2));
        int mm = parseIntSeguro(hora.substring(3, 5));

        if (y == -1 || m == -1 || d == -1 || hh == -1 || mm == -1) return null;

        return LocalDateTime.of(y, m, d, hh, mm);
    }

    private static int parseIntSeguro(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }
}

