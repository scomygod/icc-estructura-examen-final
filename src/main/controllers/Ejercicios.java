package main.controllers;

import java.util.HashMap;
import java.util.Map;


public class Ejercicios {

    // Ordenamiento Burbuja
    public int[] sortByBubble(int[] estudiantes) {
        int n = estudiantes.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (estudiantes[j] > estudiantes[j + 1]) {
                   
                    int temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
        return estudiantes;


    // Ejercicio Dos

        public String contarFrecuenciaDePalabras(String text) {
            Map<String, Integer> almacenarPalabras = new HashMap<>();

        }

        public String verificarCaracteresUnicos(String input) {

        }

    }
}
