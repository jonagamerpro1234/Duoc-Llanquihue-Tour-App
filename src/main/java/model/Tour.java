package model;

/**
 * @author Michael Salgado
 * @since 1.0.0
 */
public class Tour {

    //Atributos de clase Tour
    private String nombreTour;
    private String descripcion;
    private String tipo;
    private int precio;
    private int duracionHora;
    private int cuposDisponibles;

    //Atributos de otras clases
    private Guia guia;

    /**
     * Constructor de clase Tour
     */
    public Tour(String nombreTour, String descripcion, String tipo, int precio, int duracionHora, int cuposDisponibles) {
        this.nombreTour = nombreTour;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.duracionHora = duracionHora;
        this.cuposDisponibles = cuposDisponibles;
    }

    public String getNombreTour() {
        return nombreTour;
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

    public void setNombreTour(String nombre) {
        this.nombreTour = nombre;
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
            ------------------------------
            """.formatted(
                nombreTour,
                tipo,
                descripcion,
                precio,
                duracionHora,
                cuposDisponibles
        );
    }
}
