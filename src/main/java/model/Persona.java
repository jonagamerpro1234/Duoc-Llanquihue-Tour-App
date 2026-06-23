package model;

/**
 * Representa una persona asociada a la agencia Llanquihue Tour.
 *
 * @author Michael Salgado
 * @since 1.1.0
 */
public class Persona {

    private String nombre;
    private String apellido;
    private final Rut rut;
    private String telefono;

    public Persona(String nombre, String apellido, String rut, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = new Rut(rut);
        this.telefono = telefono;
    }

    /**
     * @return devuelve un correo genérico con el formato de nombre.apellido@llanquihuetour.cl
     */
    public String getCorreo() {
        return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@llanquihuetour.cl";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rut getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return nombre + " " +  apellido;
    }
}
