package co.edu.uniquindio.punto3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaDePalabras {

    public static void main(String[] args) {

        Map<String, Integer> mapaPalabras = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        String[] palabras = texto.toLowerCase().split("\\s+");

        for (String palabra : palabras) {

            palabra = palabra.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "");
            if (!palabra.isEmpty()) {

                if (mapaPalabras.containsKey(palabra)) {
                    mapaPalabras.put(palabra, mapaPalabras.get(palabra) + 1);
                } else {

                    mapaPalabras.put(palabra, 1);
                }
            }
        }

        System.out.println("Frecuencia de palabras en el texto:");
        for (Map.Entry<String, Integer> entrada : mapaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

