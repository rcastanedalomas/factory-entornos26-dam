import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1) Geometría");
            System.out.println("2) Cálculo");
            System.out.println("3) Utilidades");
            System.out.println("4) Leer entero en rango");
            System.out.println("0) Salir");

            opcion = Entrada.leerEntero(sc, "Opción: ");

            if (opcion == 1) {
                MenuGeometria.ejecutar(sc);
            } else if (opcion == 2) {
                MenuCalculo.ejecutar(sc);
            } else if (opcion == 3) {
                MenuUtilidades.ejecutar(sc);
            } else if (opcion == 4) {
                Entrada.leerEnteroEnRango(sc);
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        System.out.println("Saliendo...");
        sc.close();
    }
}
