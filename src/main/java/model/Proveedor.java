package model;

/**
 * Representa un proveedor asociado a la agencia Llanquihue Tour.
 *
 * @author Michael Salgado
 * @since 1.1.0
 */
public class Proveedor extends Persona {

    private String servicio;

    public Proveedor(String nombre, String apellido, String rut, String telefono, String servicio) {
        super(nombre, apellido, rut, telefono);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return """
            ------------------------------
            Proveedor: %s %s
            RUT: %s
            Teléfono: %s
            Servicio: %s
            ------------------------------
            """.formatted(
                getNombre(),
                getApellido(),
                getRut(),
                getTelefono(),
                servicio
        );
    }
}
