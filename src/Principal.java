import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Implementacion implementacion = new Implementacion(); // Ahora maneja la lista y la lógica de votos

		// Solicitar el número de candidatos y sus nombres
		System.out.print("Ingrese el número de candidatos: ");
		int numeroCandidatos = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numeroCandidatos; i++) {
			System.out.print("Nombre del candidato " + (i + 1) + ": ");
			String nombre = scanner.nextLine();
			implementacion.agregarCandidato(nombre);
		}

		// Solicitar el número de votantes
		System.out.print("Ingrese el número de votantes: ");
		int numeroVotantes = scanner.nextInt();

		// Registrar votos para cada votante
		for (int i = 0; i < numeroVotantes; i++) {
			System.out.print("Ingrese el voto del votante " + (i + 1) + " (número de candidato entre 1 y "
					+ numeroCandidatos + "): ");
			int voto = scanner.nextInt();
			implementacion.agregarVoto(voto - 1); // Ajuste para el índice
		}

		// Mostrar resultados finales
		implementacion.mostrarResultados();

		scanner.close();
	}

}
