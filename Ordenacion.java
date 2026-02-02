public class Ordenacion {

    public static void burbuja(int[] a) {
        if (a == null) return;

        // Imperfección intencionada: sin early-stop
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    ArraysUtil.swap(a, j, j + 1);
                }
            }
        }
    }

    public static boolean estaOrdenado(int[] a) {
        if (a == null) return true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) return false;
        }
        return true;
    }

    public static void burbujaDesc(int[] a) {
        if (a == null) return;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    ArraysUtil.swap(a, j, j + 1);
                }
            }
        }
    }
}
