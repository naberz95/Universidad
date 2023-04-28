public class Nodo {
    public int valor;
    public Nodo siguiente;

        // metodos que seran implementados en la clase lista//
        
        public Nodo(int valor) {
            this.valor = valor;
            siguiente = null;
        }

        public int getValor() {
            return valor;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
 }

