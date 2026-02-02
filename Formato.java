public class Formato {

    public static double redondear2(double x) {
        // Imperfección intencionada: método manual mejorable
        int tmp = (int) (x * 100);
        return tmp / 100.0;
    }

    public static String repetir(char c, int n) {
        if (n <= 0) return "";
        String s = "";
        for (int i = 0; i < n; i++) s = s + c;
        return s;
    }

    public static String alinearDerecha(String s, int ancho) {
        if (s == null) s = "";
        if (ancho <= s.length()) return s;

        int espacios = ancho - s.length();
        return repetir(' ', espacios) + s;
    }
}
