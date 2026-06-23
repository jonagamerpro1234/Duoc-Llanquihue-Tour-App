package servicios;

import model.Tour;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Clase encargada de gestionar y manejar los tours del sistema.
 *
 * @author Michael Salgado
 * @since 1.1.0
 */
public class TourManager {

    /**
     * Obtiene los tours que poseen cupos disponibles.
     *
     * @param tours lista de tours
     * @return lista de tours con cupos disponibles
     */
    public ArrayList<Tour> getToursDisponibles(@NotNull ArrayList<Tour> tours) {

        ArrayList<Tour> toursDisponibles = new ArrayList<>();

        for (Tour tour : tours) {

            if (tour.getCuposDisponibles() > 0) {
                toursDisponibles.add(tour);
            }

        }

        return toursDisponibles;
    }

    /**
     * Muestra una lista de tours por consola.
     *
     * @param tours lista de tours a mostrar
     */
    public void mostrarTours(@NotNull ArrayList<Tour> tours) {

        for (Tour tour : tours) {
            System.out.println(tour);
        }

    }

}