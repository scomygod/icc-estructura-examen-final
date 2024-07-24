package main.models;

public class Estudiante {

    public String nombre;
    public int calificacion;

    // Constructor
    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", calificacion=" + calificacion + "]";
    }
}
