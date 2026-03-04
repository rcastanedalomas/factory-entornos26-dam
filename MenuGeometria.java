
import java.util.Scanner;

public class MenuGeometria {

    public static void ejecutar(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ GEOMETRÍA ---");
            System.out.println("1) Área círculo");
            System.out.println("2) Área cuadrado");
            System.out.println("3) Volumen cubo");
            System.out.println("4) Área rectángulo");
            System.out.println("5) Área cilindro");
            System.out.println("0) Volver");

            opcion = Entrada.leerEntero(sc, "Opción: ");

            if (opcion == 1) {
                double r = Entrada.leerDouble(sc, "Radio: ");
                double res = Geometria.areaCirculo(r);
                mostrarDouble(res);
            } else if (opcion == 2) {
                double l = Entrada.leerDouble(sc, "Lado: ");
                double res = Geometria.areaCuadrado(l);
                mostrarDouble(res);
            } else if (opcion == 3) {
                double l = Entrada.leerDouble(sc, "Lado: ");
                double res = Geometria.volumenCubo(l);
                mostrarDouble(res);
            } else if (opcion == 4) {
                double a = Entrada.leerDouble(sc, "Ancho: ");
                double b = Entrada.leerDouble(sc, "Alto: ");
                double res = Geometria.areaRectangulo(a, b);
                mostrarDouble(res);
            } else if (opcion == 5) {
                double r = Entrada.leerDouble(sc, "Radio: ");
                double h = Entrada.leerDouble(sc, "Altura: ");
                double res = Geometria.areaCilindro(r, h);
                mostrarDouble(res);
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    private static void mostrarDouble(double res) {
        if (res < 0) System.out.println("Resultado no válido.");
        else System.out.println("Resultado = " + res);
    }
}