import java.util.ArrayList;

public class GeneradorDatos {

    public static int[] arrayAleatorio(int n, int min, int max) {
        // Imperfección intencionada: no valida min <= max ni n > 0
        if (n <= 0) return null;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = numeroAleatorio(min, max);
        }
        return a;
    }

    public static ArrayList<Integer> listaAleatoria(int n, int min, int max) {
        ArrayList<Integer> lista = new ArrayList<>();
        if (n <= 0) return lista;

        for (int i = 0; i < n; i++) {
            lista.add(numeroAleatorio(min, max));
        }
        return lista;
    }

    public static int[] arrayCreciente(int n) {
        if (n <= 0) return null;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = i;
        return a;
    }

    private static int numeroAleatorio(int min, int max) {
        // Si min > max, esto generará cosas raras: intencionado para backlog
        int rango = (max - min) + 1;
        int r = (int) (Math.random() * rango);
        return min + r;
    }
}
