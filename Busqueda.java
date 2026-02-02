public class Busqueda {

    public static int lineal(int[] a, int x) {
        if (a == null) return -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static int binaria(int[] a, int x) {
        // Imperfección intencionada: asume array ordenado
        if (a == null) return -1;

        int ini = 0;
        int fin = a.length - 1;

        while (ini <= fin) {
            int mid = (ini + fin) / 2;
            if (a[mid] == x) return mid;
            if (x < a[mid]) fin = mid - 1;
            else ini = mid + 1;
        }
        return -1;
    }

    public static int contarApariciones(int[] a, int x) {
        if (a == null) return 0;
        int c = 0;
        for (int v : a) if (v == x) c++;
        return c;
    }
}
