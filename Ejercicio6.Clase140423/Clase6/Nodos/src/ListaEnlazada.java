public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }
    
    //Metodo para agregarNodo//

    public void agregarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

     //Metodo para mostrarNodo//
    public void mostrarNodos() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
    }

    //Metodo de eliminar Nodos//
    public void eliminarNodo(int dato) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
        } else {
            Nodo anterior = cabeza;
            Nodo actual = cabeza.siguiente;

            while (actual != null && actual.dato != dato) {
                anterior = actual;
                actual = actual.siguiente;
            }

            if (actual != null) {
                anterior.siguiente = actual.siguiente;
            }
        }
    }
}