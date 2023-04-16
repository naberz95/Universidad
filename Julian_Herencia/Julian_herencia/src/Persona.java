public class Persona {
    // Declaramos las variables, Recorda usar CamelCase//
    String nombre, apellido, tipoDeDocumento;
    Long numDocumento;

    // Creo el Constructor de la clase Persona//
    public Persona(String nombre, String apellido, String tipoDeDocumento, Long numDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numDocumento = numDocumento;
    }
}
/**
 * Este archivo tiene como tal la definición de la clase Persona ques es la
 * clase padre de Emplado y Cliente.
 * 
 */