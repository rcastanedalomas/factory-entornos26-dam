

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

    public static double areaRectangulo(double ancho, double alto) {
        if (ancho < 0 || alto < 0) return -1;
        return ancho * alto;
    }
	   public static double areaCilindro(double radio, double altura) {
	        if (radio < 0 || altura < 0) return -1;
	       
	        return 2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio,  2);
	    }
}

