public class ArraysUtil {

    public static void imprimir(int[] a) {
        if (a == null) {
            System.out.println("(array null)");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] copiar(int[] a) {
        if (a == null) return null;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[i];
        return b;
    }

    public static void swap(int[] a, int i, int j) {
        // Imperfección intencionada: no valida índices
        if (a == null) return;
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
