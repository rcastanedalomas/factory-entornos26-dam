public class Cadenas {

    public static int contarVocales(String texto) {
        if (texto == null) return 0;

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') contador++;
        }
        return contador;
    }

    public static String invertir(String texto) {
        if (texto == null) return "";

        String res = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            res = res + texto.charAt(i);
        }
        return res;
    }

    public static boolean esPalindromo(String texto) {
        if (texto == null) return false;

        String limpio = texto.replace(" ", "").toLowerCase();
        int i = 0;
        int j = limpio.length() - 1;

        while (i < j) {
            if (limpio.charAt(i) != limpio.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
     //FUNCION 9
    public static int contarPalabras(String texto) {
    	if (texto == null || texto.trim().isEmpty()) return 0;

    	String[] palabras = texto.trim().split(" ");
    	return palabras.length;
    }
}
