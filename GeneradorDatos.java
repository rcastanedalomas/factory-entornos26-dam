import java.util.ArrayList;

public class GeneradorDatos {

	public static int[] arrayAleatorio(int n, int min, int max) {
		// Imperfección intencionada: no valida min <= max ni n > 0
		

		int[] a = new int[n];
		
		if (min >= max) {
			System.out.println("El numero minimo no debe ser igual o superior al maximo.");
			return null;
		} else {
			for (int i = 0; i < n; i++) {

				a[i] = numeroAleatorio(min, max);

			}
		}
		return a;
	}

	public static ArrayList<Integer> listaAleatoria(int n, int min, int max) {
		ArrayList<Integer> lista = new ArrayList<>();
		if (n <= 0)
			return lista;

		for (int i = 0; i < n; i++) {
			lista.add(numeroAleatorio(min, max));
		}
		return lista;
	}

	public static int[] arrayCreciente(int n) {
		if (n <= 0)
			return null;
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = i;
		return a;
	}

	private static int numeroAleatorio(int min, int max) {
		int inputErroneo = 0;
		// Si min > max, esto generará cosas raras: intencionado para backlog
		if (min >= max) {
			System.out.println("El numero minimo no debe ser igual o superior al maximo. Prueba otra vez.");
			return inputErroneo;
		} else {
			int rango = (max - min) + 1;
			int r = (int) (Math.random() * rango);
			return min + r;
		}
	}
}
