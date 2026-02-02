public class Estadistica {

    public static int suma(int[] a) {
        if (a == null) return 0;
        int s = 0;
        for (int v : a) s += v;
        return s;
    }

    public static double media(int[] a) {
        if (a == null || a.length == 0) return 0;
        // Imperfección intencionada: suma en int (posible overflow)
        int s = suma(a);
        return (double) s / a.length;
    }

    public static int minimo(int[] a) {
        if (a == null || a.length == 0) return 0;
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) m = a[i];
        }
        return m;
    }
}
