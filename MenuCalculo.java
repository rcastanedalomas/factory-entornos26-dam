import java.util.ArrayList;
import java.util.Scanner;

public class MenuCalculo {

    public static void ejecutar(Scanner sc) {
        int[] array = null;

        int opcion;
        do {
            System.out.println("\n--- MENÚ CÁLCULO ---");
            System.out.println("1) Crear array manual");
            System.out.println("2) Crear array aleatorio");
            System.out.println("3) Mostrar array");
            System.out.println("4) Ordenar (burbuja)");
            System.out.println("5) Búsqueda lineal");
            System.out.println("6) Media del array");
            System.out.println("7) MCD (dos enteros)");
            System.out.println("8) Mayor/Menor de lista (ArrayList)");
            System.out.println("9) Ordenar descendente (burbuja)");
            System.out.println("0) Volver");

            opcion = Entrada.leerEntero(sc, "Opción: ");

            if (opcion == 1) {
                array = leerArrayManual(sc);
            } else if (opcion == 2) {
                int n = Entrada.leerEntero(sc, "Tamaño: ");
                int min = Entrada.leerEntero(sc, "Mínimo: ");
                int max = Entrada.leerEntero(sc, "Máximo: ");
                array = GeneradorDatos.arrayAleatorio(n, min, max);
                System.out.println("Array creado.");
            } else if (opcion == 3) {
                ArraysUtil.imprimir(array);
            } else if (opcion == 4) {
                Ordenacion.burbuja(array);
                System.out.println("Array ordenado.");
            } else if (opcion == 5) {
                int x = Entrada.leerEntero(sc, "Valor a buscar: ");
                int pos = Busqueda.lineal(array, x);
                System.out.println("Posición = " + pos);
            } else if (opcion == 6) {
                double m = Estadistica.media(array);
                System.out.println("Media = " + m);
            } else if (opcion == 7) {
                int a = Entrada.leerEntero(sc, "a: ");
                int b = Entrada.leerEntero(sc, "b: ");
                int res = Calculo.mcd(a, b);
                System.out.println("MCD = " + res);
            } else if (opcion == 8) {
                ArrayList<Integer> lista = leerLista(sc);
                System.out.println("Mayor = " + Calculo.mayor(lista));
                System.out.println("Menor = " + Calculo.menor(lista));
            } else if (opcion == 9) {
                Ordenacion.burbujaDesc(array);
                System.out.println("Array ordenado descendientemente.");
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    private static int[] leerArrayManual(Scanner sc) {
        int n = Entrada.leerEntero(sc, "Tamaño: ");
        if (n <= 0) return null;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Entrada.leerEntero(sc, "Elemento[" + i + "]: ");
        }
        return a;
    }

    private static ArrayList<Integer> leerLista(Scanner sc) {
        int n = Entrada.leerEntero(sc, "Cantidad: ");
        ArrayList<Integer> lista = new ArrayList<>();
        if (n <= 0) return lista;

        for (int i = 1; i <= n; i++) {
            lista.add(Entrada.leerEntero(sc, "Número " + i + ": "));
        }
        return lista;
    }
}
