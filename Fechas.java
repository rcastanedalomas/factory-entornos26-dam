import java.time.Duration;
import java.time.LocalDateTime;

public class Fechas {

    public static long segundosDesde(LocalDateTime fecha) {
        if (fecha == null) return 0;
        LocalDateTime ahora = LocalDateTime.now();
        return Duration.between(fecha, ahora).getSeconds();
    }

    public static long segundosEntre(LocalDateTime inicio, LocalDateTime fin) {
        if (inicio == null || fin == null) return 0;
        return Duration.between(inicio, fin).getSeconds();
    }

    public static String formatearSegundos(long segundos) {
        long s = Math.abs(segundos);

        long dias = s / 86400;
        s %= 86400;
        long horas = s / 3600;
        s %= 3600;
        long minutos = s / 60;
        s %= 60;

        String signo = (segundos < 0) ? "-" : "";
        return signo + dias + "d " + horas + "h " + minutos + "m " + s + "s";
    }
}

