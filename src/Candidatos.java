
public class Candidatos {

	private String nombre;
	private int votos;
	
	//Constructor vacio
	public Candidatos() {
	}

	//Constructor lleno
	public Candidatos(String nombre) {
		this.nombre = nombre;
		this.votos = 0;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Candidatos [nombre=" + nombre + ", votos=" + votos + "]\n";
	}
	
	
	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVotos() {
		return votos;
	}
	
	// Método para agregar un voto, incrementando el contador de votos
    public void agregarVoto() {
        this.votos++;
    }

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	
	
	
	
	
	
	
	
}
