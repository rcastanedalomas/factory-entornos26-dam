import java.time.LocalDateTime;
import java.util.Scanner;

public class Entrada {

    public static int leerEntero(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Introduce un entero válido. " + msg);
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    public static double leerDouble(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Introduce un número válido. " + msg);
        }
        double v = sc.nextDouble();
        sc.nextLine();
        return v;
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

