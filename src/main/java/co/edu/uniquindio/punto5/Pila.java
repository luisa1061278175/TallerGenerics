package co.edu.uniquindio.punto5;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila<T> {
    private ArrayList<T> elementos;
    public Pila() {
        elementos = new ArrayList<>();
    }
    public void push(T elemento) {
        elementos.add(elemento);
    }
    public T pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        return elementos.remove(elementos.size() - 1);
    }

    public T peek() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }


    public int tamaño() {
        return elementos.size();
    }

    public static void main(String[] args) {

        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.push(10);
        pilaEnteros.push(20);
        System.out.println("Cima de la pila: " + pilaEnteros.peek());
        System.out.println("Desapilar: " + pilaEnteros.pop());
        System.out.println("Cima de la pila tras desapilar: " + pilaEnteros.peek());


    }
}

