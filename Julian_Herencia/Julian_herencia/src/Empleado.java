import java.util.Scanner;

//importamos la libreria Scanner porque la vamos a usar//
class Empleado extends Persona {
    // Declaramos las variables adicionales//
    int sueldo;
    int codigo;

    // Creamos el constructor de la clase Empleado,no le egrego al constructor ni
    // sueldo,ni codigo//
    public Empleado(String nombre, String apellido, String tipoDeDocumento, Long numDocumento) {
        // ingresamos el super que traemos de herencia de Persona//
        super(nombre, apellido, tipoDeDocumento, numDocumento);
        // Creamos el objeto teclado//
        Scanner teclado = new Scanner(System.in);
        // Le pedidos que imprima en pantalla el mensaje de ingresar el sueldo//
        System.out.println("Porfavor ingrese el sueldo del empleado:");
        // hacemos que el dato quede guardado en la varibale,recuerda el uso del this.//
        this.sueldo = teclado.nextInt();
        // Lo mismo pero con el codigo del empleado//
        System.out.println("Porfavor ingrese el código del empleado:");
        // ingresa el dato del codigo del empleado y lo deja guardado con el this.//
        this.codigo = teclado.nextInt();
    }

    // Creamos un metodo para calcular el sueldo recuerda usar camelCase//
    public int calcularSueldo() {
        return sueldo;
    }
}
/**
 * Este archivo tiene como tal la definición de la clase Empleado ques es la
 * clase hija de Persona.
 * 
 */