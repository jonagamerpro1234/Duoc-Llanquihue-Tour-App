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
    public void setServicio(String servicio) {}

    @Override
    public String toString() {
        return """
                Proveedor[
                    nombre=%s,
                    apellido=%s,
                    rut=%s,
                    telefono=%s,
                    servicio=%s
                ]
                """.formatted(
                getNombre(),
                getApellido(),
                getRut(),
                getTelefono(),
                servicio
        );
    }
}
