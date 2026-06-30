package model;

/**
 * Representa un servicio turístico ofrecido por la agencia.
 *
 * @author Michael Salgado
 * @since 1.2.0
 */
public class ServicioTuristico {

    // Atributos de la clase ServicioTuristico
    private String nombre;
    private int duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     *
     * @param nombre nombre del servicio turístico
     * @param duracionHoras duración del servicio en horas
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    /**
     * @return nombre del servicio turístico
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre del servicio turístico
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return duración del servicio en horas
     */
    public int getDuracionHoras() {
        return duracionHoras;
    }

    /**
     * @param duracionHoras nueva duración del servicio
     */
    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return """
                ------------------------------
                Nombre: %s
                Duración: %d horas
                ------------------------------
                """.formatted(
                nombre,
                duracionHoras
        );
    }

}