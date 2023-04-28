import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

                // Solicitar al usuario el tamaño del arreglo
                System.out.print("Ingrese el tamaño del arreglo: ");
                int tamaño = teclado.nextInt();

                // Crear el arreglo
                int[] arreglo = new int[tamaño];

                // Leer los elementos del arreglo
                System.out.println("Ingrese los elementos del arreglo:");
                for (int i = 0; i < tamaño; i++) {
                    arreglo[i] = teclado.nextInt();
                }

                // Solicitar al usuario el valor a buscar
                System.out.print("Ingrese el valor a buscar: ");
                int valorBuscado = teclado.nextInt();

                // Buscar el valor en el arreglo
                int posicion = -1;
                for (int i = 0; i < tamaño; i++) {
                    if (arreglo[i] == valorBuscado) {
                        posicion = i;
                        break;
                    }
                }

                // Mostrar el resultado de la búsqueda
                if (posicion != -1) {
                    System.out.println("El valor buscado se encuentra en la posición " + posicion);
                } else {
                    System.out.println("El valor buscado no se encuentra en el arreglo.");
                }


    }
}



