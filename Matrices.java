public class Matrices {

    public static int[][] suma(int[][] a, int[][] b) {
        // Imperfección intencionada: no comprueba dimensiones
        if (a == null || b == null) return null;

        int filas = a.length;
        int cols = a[0].length;

        int[][] r = new int[filas][cols];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                r[i][j] = a[i][j] + b[i][j];
            }
        }
        return r;
    }

    public static int[][] transponer(int[][] a) {
        if (a == null) return null;

        int filas = a.length;
        int cols = a[0].length;

        int[][] t = new int[cols][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    public static void imprimir(int[][] a) {
        if (a == null) {
            System.out.println("(matriz null)");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("[");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j < a[i].length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
