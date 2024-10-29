import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {
	// Lista de candidatos
	private List<Candidatos> listaCandidatos;

	public Implementacion() {
        this.listaCandidatos = new ArrayList<>();
    }

    public void agregarCandidato(String nombre) {
        listaCandidatos.add(new Candidatos(nombre)); // Crear y agregar el nuevo candidato
    }

    @Override
    public void agregarVoto(int indiceCandidato) {
        if (indiceCandidato >= 0 && indiceCandidato < listaCandidatos.size()) {
            listaCandidatos.get(indiceCandidato).agregarVoto();
        } else {
            System.out.println("Índice de candidato inválido.");
        }
    }

    @Override
    public void mostrarResultados() {
        System.out.println("\nResultados de las elecciones:");
        listaCandidatos.sort((c1, c2) -> Integer.compare(c2.getVotos(), c1.getVotos()));
        for (int i = 0; i < listaCandidatos.size(); i++) {
            System.out.println("Lugar " + (i + 1) + ": " + listaCandidatos.get(i));
        }
    }

    public List<Candidatos> getListaCandidatos() {
        return listaCandidatos;
    }
}
