package model;

/**
 * Representa una ruta gastronómica ofrecida por la agencia.
 *
 * @author Michael Salgado
 * @since 1.2.0
 */
public class RutaGastronomica extends ServicioTuristico {

    // Atributo propio de la clase RutaGastronómica
    private int numeroDeParadas;

    /**
     * Constructor de la clase RutaGastronómica.
     *
     * @param nombre nombre del servicio turístico
     * @param duracionHoras duración del servicio en horas
     * @param numeroDeParadas cantidad de paradas gastronómicas
     */
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * @return cantidad de paradas gastronómicas
     */
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    /**
     * @param numeroDeParadas nueva cantidad de paradas
     */
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return """
                ------------------------------
                Ruta Gastronómica
                Nombre: %s
                Duración: %d horas
                Número de Paradas: %d
                ------------------------------
                """.formatted(
                getNombre(),
                getDuracionHoras(),
                numeroDeParadas
        );
    }

}