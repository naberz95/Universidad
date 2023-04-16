class Cliente extends Persona {
    String categoria;

    public Cliente(String nombre, String apellido, String tipoDeDocumento, Long numDocumento) {
        super(nombre, apellido, tipoDeDocumento, numDocumento);
    }
}