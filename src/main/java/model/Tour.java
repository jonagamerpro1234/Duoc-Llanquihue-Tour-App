package model;

/**
 * Representa un tour turístico ofrecido por la agencia.
 *
 * @author Michael Salgado
 * @since 1.0.0
 */
public class Tour {

    //Atributos de clase Tour
    private String nombre;
    private String descripcion;
    private String tipo;
    private int precio;
    private int duracionHora;
    private int cuposDisponibles;

    //Atributos de otras clases
    private Guia guia;

    /**
     * Constructor de la clase Tour.
     *
     * @param nombre nombre del tour
     * @param descripcion descripción del tour
     * @param tipo tipo de tour
     * @param precio precio del tour
     * @param duracionHora duración en horas
     * @param cuposDisponibles cantidad de cupos disponibles
     * @param guia guía responsable del tour
     */
    public Tour(String nombre, String descripcion, String tipo, int precio, int duracionHora, int cuposDisponibles, Guia guia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.duracionHora = duracionHora;
        this.cuposDisponibles = cuposDisponibles;
        this.guia = guia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDuracionHora() {
        return duracionHora;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDuracionHora(int duracionHora) {
        this.duracionHora = duracionHora;
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return """
            ------------------------------
            Nombre: %s
            Tipo: %s
            Descripción: %s
            Precio: $%d
            Duración: %d horas
            Cupos Disponibles: %d
            Guía Responsable: %s %s
            ------------------------------
            """.formatted(
                nombre,
                tipo,
                descripcion,
                precio,
                duracionHora,
                cuposDisponibles,
                guia.getNombre(),
                guia.getApellido()
        );
    }
}
