import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    //Declaro el Arreglo//

        int[][] ventas = new int[3][4];
        //Declaro el Scaner para los datos//
        Scanner teclado = new Scanner(System.in);

        //declaro un ciclo Form que recorra el arreglo //
        for (int dia = 0; dia < 3; dia++) {
            for (int vendedor = 0; vendedor < 4; vendedor++) {
                System.out.print("Porfavor ingrese las ganancias que genero el vendedor " + (vendedor + 1) + " en el día " + (dia + 1) + ": ");
                ventas[dia][vendedor] = teclado.nextInt();
            }
        }
        //creo una variable nueva llamada numVendedor y declaro que sea ingresada por teclado//
        System.out.print("Ingrese del 1 al 4 que vendedor desea consultar sus ventas ");
        int numVendedor = teclado.nextInt();

        //Inicializo una variable total la cual sera la sumatoria de las ventas//
        int total = 0;
        //Creo un ciclo for en donde sume los valores de los datos que ingrese en el punto anterior//
        for (int i = 0; i < 3; i++) {
            total += ventas[i][numVendedor - 1];
        }
        //imprimo el numero de vendedor que seleccione y el total de sus ventas//
        System.out.println("El total de ventas del vendedor " + numVendedor + " es: " + total + "$ pesos");

    }
}
//Codigo Nolberto Gomez//