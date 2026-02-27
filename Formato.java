public class Formato {

    public static double redondear2(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    public static String repetir(char c, int n) {
        if (n <= 0) return "";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) sb.append(c);
        return sb.toString();
    }

    public static String alinearDerecha(String s, int ancho) {
        if (s == null) s = "";
        if (ancho <= s.length()) return s;

        int espacios = ancho - s.length();
        return repetir(' ', espacios) + s;
    }
}
