public class Main {
    public static void main(String[] args)  {
        //Creo el Objeto //
        ListaEnlazada lista = new ListaEnlazada();
        //Se agregan los Datos //
        lista.agregarNodo(50);
        lista.agregarNodo(100);
        lista.agregarNodo(3);
        lista.agregarNodo(4);
        lista.agregarNodo(500);
        //Muestro los datos//
        lista.mostrarNodos();
        //imprimo los datos//
        System.out.println();
        //elimino el numero de nodo//
        lista.eliminarNodo(4);
        //Muestro los nodos//
        lista.mostrarNodos();
        lista.agregarNodo(600);
        lista.mostrarNodos();
    }
}
