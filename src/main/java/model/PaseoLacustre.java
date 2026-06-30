package model;

/**
 * Representa un paseo lacustre ofrecido por la agencia.
 *
 * @author Michael Salgado
 * @since 1.2.0
 */
public class PaseoLacustre extends ServicioTuristico {

    // Atributo propio de la clase PaseoLacustre
    private String tipoEmbarcacion;

    /**
     * Constructor de la clase PaseoLacustre.
     *
     * @param nombre nombre del servicio turístico
     * @param duracionHoras duración del servicio en horas
     * @param tipoEmbarcacion tipo de embarcación utilizada
     */
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {

        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * @return tipo de embarcación utilizada
     */
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    /**
     * @param tipoEmbarcacion nuevo tipo de embarcación
     */
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return """
                ------------------------------
                Paseo Lacustre
                Nombre: %s
                Duración: %d horas
                Tipo de Embarcación: %s
                ------------------------------
                """.formatted(
                getNombre(),
                getDuracionHoras(),
                tipoEmbarcacion
        );
    }
}