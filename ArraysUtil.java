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
    	
        if (a == null) return;
        
        // validamos si los indices i y j estan dentro de los limites
        // si son menores que 0 o maior/igual que el tamño del array. paramos
        
        if (i<0 || i>= a.length || j<0 ||j>=a.length) {
        	return;
        }
        	
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
