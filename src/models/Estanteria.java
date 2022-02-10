package models;

import java.util.ArrayList;

public class Estanteria {
	private ArrayList<Libros> estanteria;
	private String nombre;

	public ArrayList<Libros> getEstanteria() {
		return estanteria;
	}

	public String getNombre() {
		return nombre;
	}

	public Estanteria(String nombre) {
		super();
		if (nombre.equals("Matematicas")) {
			this.estanteria = new ArrayList<Libros>();
			estanteria.add(new Libros(1, "Aritmetica", "Juan Lorenzo", "Matematicas", true));
			estanteria.add(new Libros(2, "Geometria", "Felipe Perez", "Matematicas", true));
			this.nombre = nombre;
		} else if (nombre.equals("Idiomas")) {
			this.estanteria = new ArrayList<Libros>();
			estanteria.add(new Libros(3, "Ingles", "Julio Beren", "Idioma", true));
			estanteria.add(new Libros(4, "Frances", "Jean Pierre Polnareff", "Idioma", true));
			this.nombre = nombre;

		} else if (nombre.equals("Historia")) {
			this.estanteria = new ArrayList<Libros>();
			estanteria.add(new Libros(5, "Historia contemporanea", "Felipe Quinto", "Historia", true));
			estanteria.add(new Libros(6, "Edad Media", "Felipe segundo", "Historia", true));
			this.nombre = nombre;

		}
	}
}
