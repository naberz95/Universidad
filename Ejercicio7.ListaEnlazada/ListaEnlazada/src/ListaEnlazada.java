public class ListaEnlazada {
    
    public Nodo cabeza;
    public int tamaño;

    //Metodo constructor
    public ListaEnlazada() {
        cabeza = null;
        tamaño = 0;
    }

     // Metodo para agregar datos a la lista
     public void agregarNodo(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        }
        tamaño++;
    }

    // Metodo Esta vacia la lista?
    public boolean estaVacia() {
        return cabeza == null;
    }

    // metodo para mostar el tamaño de la lista
    public int mostrarTamaño() {
        return tamaño;
    }
     //mostar nodos//
     // Metodo para mostrar los datos
     public int mostrarValor(int posicion) {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return -1;
        } else if (posicion < 0 || posicion >= tamaño) {
            System.out.println("La posición buscada no existe en la lista");
            return -1;
        } else {
            int contador = 0;
            Nodo actual = cabeza;
            while (contador < posicion) {
                actual = actual.getSiguiente();
                contador++;
            }
            return actual.getValor();
        }
    }

    // Metodo para mostar la cabeza de la lista
    public int mostrarCabeza() {
        if (estaVacia()) {
            System.out.println("No hay nada en la lista");
            return -1;
        } else {
            return cabeza.getValor();
        }
    }

    // Metodo para mostar el ultimo de la lista
    public int mostrarUltimo() {
        if (estaVacia()) {
            System.out.println("No hay nada en la lista");
            return -1;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            return actual.getValor();
        }
    }
   
        //Metodo para mostrarNodo//
        public void mostrarNodos() {
            Nodo actual = cabeza;
    
            while (actual != null) {
                System.out.println("los valores en los nodos son : ");
                System.out.print(actual.valor + "\n");
                actual = actual.siguiente;
            }
        }
    //Ingresar datos //
    //Metodo para agregar nodo a la cabeza de la lista//
    public void insertarAlInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
     }
    //Metodo para agregador nodo al final//
    public void insertarAlFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
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
     //Metodo para agregar un dato intermedio//
     public void insertarDespuesDe(int valor, int nuevoValor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == valor) {
                Nodo nuevoNodo = new Nodo(nuevoValor);
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                return;
            }
            actual = actual.siguiente;
        }
    }
    /*
     * Ojo con este metodo en especial,toca meter dos datos, el valor que este en el arreglo
     * y el nuevo valor, asi se ingresara el dato despues del que le ingresamos, ejemplo tenemos
     * 2-3-5-4, queremos meter uno despus del 5 entonces en el metodo ingresamos 5,10
     * y quedaria el arreglo como 2-3-5-10-4
     */
    //Metodo para eliminar nodo//
        //Metodo de eliminar Nodos//
        public void eliminarNodo(int valor) {
            if (cabeza == null) {
                return;
            }
    
            if (cabeza.valor == valor) {
                cabeza = cabeza.siguiente;
            } else {
                Nodo anterior = cabeza;
                Nodo actual = cabeza.siguiente;
    
                while (actual != null && actual.valor != valor) {
                    anterior = actual;
                    actual = actual.siguiente;
                }
    
                if (actual != null) {
                    anterior.siguiente = actual.siguiente;
                }
            }
        }
}
