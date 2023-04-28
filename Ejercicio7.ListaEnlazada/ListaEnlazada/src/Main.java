public class Main {
    public static void main(String[] args)  {
       //se crea el objeto
       ListaEnlazada lista = new ListaEnlazada();
       //Se agregan los Datos //
       lista.agregarNodo(50);
       lista.agregarNodo(100);
       lista.agregarNodo(3);
       lista.agregarNodo(4);
       lista.agregarNodo(500);
       //se pregunta si la lista esta vacia? 
       lista.estaVacia();
       //Mostar tamaño //
       lista.mostrarTamaño();
       //mostar Cabeza de la lista//
       lista.mostrarCabeza();
       //mostar cola de lista//
       lista.mostrarUltimo();
       //mostar valor de la lista//
       lista.mostrarValor(5);
       //mostar nodos//
       lista.mostrarNodos();
       System.out.println("\n");
       //ingresar valor a la cabeza de la lista//
       lista.insertarAlInicio(5);
       //ingresar valor a la cola de la lista//
       lista.insertarAlFinal(100);
       //ingresar dato intermetdio,osea despues de otro//
       lista.insertarDespuesDe(5, 100);
       //Eliminar nodo//
       lista.eliminarNodo(6);
       // //
       lista.mostrarNodos();
    }
}
