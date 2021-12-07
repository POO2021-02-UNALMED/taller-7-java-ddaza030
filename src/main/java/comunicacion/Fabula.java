package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return getPaginas();
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		String texto = "%s\n%s\n%s\n%s\n%s";
		return String.format(texto,getOrigen(),getTitulo(),getAutor(),String.valueOf(getPaginas()),ensenanza);
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
