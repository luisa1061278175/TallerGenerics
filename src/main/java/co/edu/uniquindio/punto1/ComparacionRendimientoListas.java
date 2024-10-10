package co.edu.uniquindio.punto1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacionRendimientoListas {

    public static void main(String[] args) {
        int elementos = 10; // Cantidad de elementos para la prueba

        // Creación de ArrayList y LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Medir tiempo de inserción en ArrayList
        long tiempoInicio = System.nanoTime();
        for (int i = 0; i < elementos; i++) {
            arrayList.add(i);
        }
        long tiempoFin = System.nanoTime();
        long tiempoInsercionArrayList = tiempoFin - tiempoInicio;
        System.out.println("Tiempo de inserción en ArrayList: " + tiempoInsercionArrayList + " nanosegundos");

        // Medir tiempo de inserción en LinkedList
        tiempoInicio = System.nanoTime();
        for (int i = 0; i < elementos; i++) {
            linkedList.add(i);
        }
        tiempoFin = System.nanoTime();
        long tiempoInsercionLinkedList = tiempoFin - tiempoInicio;
        System.out.println("Tiempo de inserción en LinkedList: " + tiempoInsercionLinkedList + " nanosegundos");

        // Medir tiempo de acceso por índice en ArrayList
        tiempoInicio = System.nanoTime();
        for (int i = 0; i < elementos; i++) {
            arrayList.get(i);
        }
        tiempoFin = System.nanoTime();
        long tiempoAccesoArrayList = tiempoFin - tiempoInicio;
        System.out.println("Tiempo de acceso por índice en ArrayList: " + tiempoAccesoArrayList + " nanosegundos");

        // Medir tiempo de acceso por índice en LinkedList
        tiempoInicio = System.nanoTime();
        for (int i = 0; i < elementos; i++) {
            linkedList.get(i);
        }
        tiempoFin = System.nanoTime();
        long tiempoAccesoLinkedList = tiempoFin - tiempoInicio;
        System.out.println("Tiempo de acceso por índice en LinkedList: " + tiempoAccesoLinkedList + " nanosegundos");

        // Medir tiempo de eliminación en ArrayList
        tiempoInicio = System.nanoTime();
        for (int i = elementos - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        tiempoFin = System.nanoTime();
        long tiempoEliminacionArrayList = tiempoFin - tiempoInicio;
        System.out.println("Tiempo de eliminación en ArrayList: " + tiempoEliminacionArrayList + " nanosegundos");

        // Medir tiempo de eliminación en LinkedList
        tiempoInicio = System.nanoTime();
        for (int i = elementos - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        tiempoFin = System.nanoTime();
        long tiempoEliminacionLinkedList = tiempoFin - tiempoInicio;
        System.out.println("Tiempo de eliminación en LinkedList: " + tiempoEliminacionLinkedList + " nanosegundos");
    }
}

