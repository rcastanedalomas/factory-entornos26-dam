import java.util.ArrayList;

public class Calculo {

    public static int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) return -1;

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int menor(ArrayList<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0;
        int min = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < min) min = lista.get(i);
        }
        return min;
    }

    public static int mayor(ArrayList<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0;
        int max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > max) max = lista.get(i);
        }
        return max;
    }
}
