import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        double sueldoTotal = 0;
        int numEmpleados = 2;

        // Ingresar los datos de varios empleados.
        for (int i = 0; i < numEmpleados; i++) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese el apellido del empleado " + (i + 1) + ":");
            String apellido = teclado.nextLine();

            System.out.println("Ingrese el tipo de documento del empleado " + (i + 1) + ":");
            String tipoDeDocumento = teclado.nextLine();

            System.out.println("Ingrese el documento del empleado " + (i + 1) + ":");
            Long documento = teclado.nextLong();

            Empleado empleado = new Empleado(nombre, apellido, tipoDeDocumento, documento);
            empleados.add(empleado);

        }

        // Calcular y mostrar el sueldo de cada empleado.
        for (Empleado empleado : empleados) {
            int sueldo = empleado.calcularSueldo();
            sueldoTotal = sueldo + sueldoTotal;
            System.out.println("El sueldo de " + empleado.nombre + " " + empleado.apellido + " es $" + sueldo
                    + " y el total es  $" + sueldoTotal);
        }
    }
}
