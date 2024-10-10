package co.edu.uniquindio.punto2;

import java.util.HashSet;

public class MiConjunto<T> {
    private HashSet<T> conjunto;

    public MiConjunto() {
        conjunto = new HashSet<>();
    }


    public boolean añadir(T elemento) {
        return conjunto.add(elemento);
    }

    public boolean eliminar(T elemento) {
        return conjunto.remove(elemento);
    }

    public boolean contiene(T elemento) {
        return conjunto.contains(elemento);
    }

    public int tamaño() {
        return conjunto.size();
    }

    public void vaciar() {
        conjunto.clear();
    }

    public void imprimirElementos() {
        for (T elemento : conjunto) {
            System.out.println(elemento);
        }
    }
    public boolean estaVacio() {
        return conjunto.isEmpty();
    }

    public static void main(String[] args) {

        MiConjunto<String> miConjunto = new MiConjunto<>();

        // Añadir elementos
        miConjunto.añadir("Elemento 1");
        miConjunto.añadir("Elemento 2");
        miConjunto.añadir("Elemento 3");

        System.out.println("¿El conjunto contiene 'Elemento 1'? " + miConjunto.contiene("Elemento 1"));

        System.out.println("Tamaño del conjunto: " + miConjunto.tamaño());

        miConjunto.eliminar("Elemento 2");
        System.out.println("Tamaño del conjunto tras eliminar 'Elemento 2': " + miConjunto.tamaño());

        System.out.println("Elementos en el conjunto:");
        miConjunto.imprimirElementos();

        miConjunto.vaciar();
        System.out.println("¿Está vacío el conjunto? " + miConjunto.estaVacio());
    }
}

