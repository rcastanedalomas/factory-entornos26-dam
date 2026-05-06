public class Conversiones {

    public static double celsiusAFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }
    
    public static double fahrenheitACelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double kmAMillas(double km) {
        return km * 0.621371;
    }
    
    public static double millasKm(double mll) {
        return mll * 1.60934;
    }

    public static double metrosACm(double m) {
        return m * 100.0;
    }

    /**
     * Convierte kilómetros a metros.
     * 1 km = 1000 metros
     */
    public static double kmAMetros(double km) {
        return km * 1000.0;
    }
}