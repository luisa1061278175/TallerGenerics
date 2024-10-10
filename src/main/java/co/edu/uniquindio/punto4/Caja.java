package co.edu.uniquindio.punto4;


public class Caja<T> {

    private T contenido;


    public void poner(T contenido) {
        this.contenido = contenido;
    }

    public T sacar() {
        return contenido;
    }

    public boolean estaVacia() {
        return contenido == null;
    }

    public static void main(String[] args) {
        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.poner(100);
        System.out.println("Contenido de la caja (entero): " + cajaEntero.sacar());

        Caja<String> cajaString = new Caja<>();
        cajaString.poner("Hola Mundo");
        System.out.println("Contenido de la caja (cadena): " + cajaString.sacar());


        Caja<Double> cajaVacia = new Caja<>();
        System.out.println("¿La caja está vacía?: " + cajaVacia.estaVacia());
    }
}
