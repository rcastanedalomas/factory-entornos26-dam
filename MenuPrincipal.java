import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1) Geometría");
            System.out.println("2) Cálculo numérico");
            System.out.println("0) Salir");
            System.out.print("Opción: ");

            opcion = leerEntero(sc);

            if (opcion == 1) {
                menuGeometria(sc);
            } else if (opcion == 2) {
                menuCalculo(sc);
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        System.out.println("Saliendo...");
        sc.close();
    }

    private static void menuGeometria(Scanner sc) {
        System.out.println("\n--- Geometría ---");
        System.out.println("1) Área círculo");
        System.out.println("2) Área cuadrado");
        System.out.println("3) Volumen cubo");
        System.out.println("0) Volver");
        System.out.print("Opción: ");

        int opcion = leerEntero(sc);

        if (opcion == 1) {
            System.out.print("Radio: ");
            double r = leerDouble(sc);
            double res = Geometria.areaCirculo(r);
            mostrarResultadoDouble(res);

        } else if (opcion == 2) {
            System.out.print("Lado: ");
            double l = leerDouble(sc);
            double res = Geometria.areaCuadrado(l);
            mostrarResultadoDouble(res);

        } else if (opcion == 3) {
            System.out.print("Lado: ");
            double l = leerDouble(sc);
            double res = Geometria.volumenCubo(l);
            mostrarResultadoDouble(res);

        } else if (opcion != 0) {
            System.out.println("Opción no válida.");
        }
    }

    private static void menuCalculo(Scanner sc) {
        System.out.println("\n--- Cálculo numérico ---");
        System.out.println("1) MCD(a,b)");
        System.out.println("2) Menor de una lista");
        System.out.println("3) Mayor de una lista");
        System.out.println("4) Media de una lista");
        System.out.println("0) Volver");
        System.out.print("Opción: ");

        int opcion = leerEntero(sc);

        if (opcion == 1) {
            System.out.print("a: ");
            int a = leerEntero(sc);
            System.out.print("b: ");
            int b = leerEntero(sc);

            int res = Calculo.mcd(a, b);
            if (res == -1) {
                System.out.println("Resultado no válido (MCD(0,0)).");
            } else {
                System.out.println("MCD = " + res);
            }

        } else if (opcion == 2) {
            ArrayList<Integer> lista = leerListaEnteros(sc);
            System.out.println("Menor = " + Calculo.menor(lista));

        } else if (opcion == 3) {
            ArrayList<Integer> lista = leerListaEnteros(sc);
            System.out.println("Mayor = " + Calculo.mayor(lista));

        } else if (opcion == 4) {
            ArrayList<Integer> lista = leerListaEnteros(sc);
            System.out.println("Media = " + Calculo.media(lista));

        } else if (opcion != 0) {
            System.out.println("Opción no válida.");
        }
    }

    private static void mostrarResultadoDouble(double res) {
        if (res < 0) {
            System.out.println("Resultado no válido (dato negativo).");
        } else {
            System.out.println("Resultado = " + res);
        }
    }

    private static ArrayList<Integer> leerListaEnteros(Scanner sc) {
        int n;
        do {
            System.out.print("¿Cuántos números vas a introducir? (>=1): ");
            n = leerEntero(sc);
            if (n < 1) System.out.println("Cantidad no válida.");
        } while (n < 1);

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            lista.add(leerEntero(sc));
        }
        return lista;
    }

    private static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Introduce un entero válido: ");
        }
        int v = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea
        return v;
    }

    private static double leerDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Introduce un número válido: ");
        }
        double v = sc.nextDouble();
        sc.nextLine(); // limpiar salto de línea
        return v;
    }
}
