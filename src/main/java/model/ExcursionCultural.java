package model;

/**
 * Representa una excursión cultural ofrecida por la agencia.
 *
 * @author Michael Salgado
 * @since 1.2.0
 */
public class ExcursionCultural extends ServicioTuristico {

    // Atributo propio de la clase ExcursionCultural
    private String lugarHistorico;

    /**
     * Constructor de la clase ExcursionCultural.
     *
     * @param nombre nombre del servicio turístico
     * @param duracionHoras duración del servicio en horas
     * @param lugarHistorico lugar histórico que será visitado
     */
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * @return lugar histórico del recorrido
     */
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    /**
     * @param lugarHistorico nuevo lugar histórico
     */
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return """
                ------------------------------
                Excursión Cultural
                Nombre: %s
                Duración: %d horas
                Lugar Histórico: %s
                ------------------------------
                """.formatted(
                getNombre(),
                getDuracionHoras(),
                lugarHistorico
        );
    }

}