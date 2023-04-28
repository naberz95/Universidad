import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Definimos el tamaño del arreglo
        System.out.print("Porfavor ingrese el tamaño: ");
        int tamaño = teclado.nextInt();

        // Crear el arreglo
        int[] Datos = new int[tamaño];

        // Leer los elementos del arreglo
        System.out.println("Ingrese los datos :");
        for (int i = 0; i < tamaño; i++) {
            Datos[i] = teclado.nextInt();
        }

        // Preguntamos el valor a buscar
        System.out.print("Ingrese el valor a buscar y eliminar: ");
        int valorBuscado = teclado.nextInt();

        // Segun el dato que se ingreso pues se busca
        int posicion = -1;
        for (int i = 0; i < tamaño; i++) {
            if (Datos[i] == valorBuscado) {
                posicion = i;
                break;
            }
        }

        // Se elimina el dato y se corre el dato siguiente a la posicion del dato eliminado
        if (posicion != -1) {
            for (int i = posicion; i < tamaño - 1; i++) {
                Datos[i] = Datos[i + 1];
            }
            Datos[tamaño - 1] = 0; // Asignar 0 al último elemento para indicar que está vacío
            tamaño--; // Actualizar el tamaño del arreglo
            System.out.println("El valor " + valorBuscado + " Se elimino .");
        } else {
            System.out.println("El valor buscado no se encontro.");
        }

        // Actualizamos el arreglo en pantalla
        System.out.println("El arreglo actualizado es:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(Datos[i] + " ");
        }
    }
}
