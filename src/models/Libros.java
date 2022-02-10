package models;

public class Libros {
	private int codigo;
	private String titulo;
	private String autor;
	private String tipo;
	private boolean disponible;
	
	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public boolean isDisponible() {
		return disponible;
	}



	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	public Libros(int codigo, String titulo, String autor, String tipo, boolean disponible) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
		this.disponible = disponible;
	}

}
