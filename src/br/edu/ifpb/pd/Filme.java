package br.edu.ifpb.pd;

public class Filme {
	
	private String titulo;
	private String diretor;
	private String estudio;
	private String genero;
	private String ano;

	public Filme (String titulo, String diretor, String estudio, String genero, String ano) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.estudio = estudio;
		this.genero = genero;
		this.ano = ano;
	}
	
	public Filme(){}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", diretor=" + diretor + ", estudio=" + estudio + ", genero=" + genero
				+ ", ano=" + ano + "]";
	}
	
	
	
}
	
