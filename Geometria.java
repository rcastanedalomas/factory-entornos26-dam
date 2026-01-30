public class Geometria {

    public static double areaCirculo(double radio) {
        if (radio < 0) return -1;
        return Math.PI * radio * radio;
    }

    public static double areaCuadrado(double lado) {
        if (lado < 0) return -1;
        return lado * lado;
    }

    public static double volumenCubo(double lado) {
        if (lado < 0) return -1;
        return lado * lado * lado;
    }
}
