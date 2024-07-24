package main.controllers;

import java.util.HashMap;
import java.util.Map;
import main.models.Estudiante;

public class EstudianteController {

    public void procesarEstudiantes(int calificacion) {
        Map<String, Integer> estudiantes = new HashMap<>();
   
        if (calificacion >= 90) {
            estudiantes.put("A", 1);
        } else if (calificacion >= 80) {
            estudiantes.put("B", 2);
        } else if (calificacion >= 70) {
            estudiantes.put("C", 3);
        } else if (calificacion >= 60) {
            estudiantes.put("D", 4);
        } else {
            estudiantes.put("F", 5);
        } 
    }

    public void obtenerCategoria(int calificacion, Map<String, Integer> estudiantes) {
        Map<String, Integer> categoria = new HashMap<>();

        if (calificacion >= 90) {
            categoria.put("A", estudiantes.get("A"));
        } else if (calificacion >= 80) {
            categoria.put("B", estudiantes.get("B"));
        } else if (calificacion >= 70) {
            categoria.put("C", estudiantes.get("C"));
        } else if (calificacion >= 60) {
            categoria.put("D", estudiantes.get("D"));
        } else {
            categoria.put("F", estudiantes.get("F"));
        }
    }
}