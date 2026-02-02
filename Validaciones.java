public class Validaciones {

    public static boolean esRangoValido(int min, int max) {
        return min <= max;
    }

    public static boolean esIndiceValido(int[] a, int i) {
        if (a == null) return false;
        return i >= 0 && i < a.length;
    }

    public static boolean esTextoNoVacio(String s) {
        return s != null && s.length() > 0;
    }
}
