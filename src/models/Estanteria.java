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
			estanteria.add(new Libros(1, "Aritmetica", "Juan Lorenzo", "Matematicas", false));
			estanteria.add(new Libros(2, "Geometria", "Felipe Perez", "Matematicas", false));
			this.nombre = nombre;
		} else if (nombre.equals("Idiomas")) {
			this.estanteria = new ArrayList<Libros>();
			estanteria.add(new Libros(1, nombre, nombre, nombre, false));
			this.nombre = nombre;

		} else if (nombre.equals("Historia")) {
			this.estanteria = new ArrayList<Libros>();
			estanteria.add(new Libros(1, nombre, nombre, nombre, false));
			this.nombre = nombre;

		}
	}
}
