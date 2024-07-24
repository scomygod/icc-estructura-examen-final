package main;

import main.controllers.Ejercicios;
import main.models.Estudiante;

public class App {
    public static void main(String[] args)  {

        Estudiante[] estudiantes = {
                new Estudiante("Juan", 85),
                new Estudiante("María", 92),
                new Estudiante("Pedro", 78),
                new Estudiante("Ana", 88),
                new Estudiante("Luis", 75)
        };
    }
}
