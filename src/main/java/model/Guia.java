package model;

/**
 * Representa al guía encargado de realizar un tour turístico.
 *
 * @author Michael Salgado
 * @since 1.1.0
 */
public class Guia extends Persona {

    private String especialidad;

    public Guia(String nombre,
                String apellido,
                String rut,
                String telefono,
                String especialidad) {

        super(nombre, apellido, rut, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return """
            ------------------------------
            Guía: %s %s
            RUT: %s
            Teléfono: %s
            Correo: %s
            Especialidad: %s
            ------------------------------
            """.formatted(
                getNombre(),
                getApellido(),
                getRut(),
                getTelefono(),
                getCorreo(),
                especialidad
        );
    }
}
