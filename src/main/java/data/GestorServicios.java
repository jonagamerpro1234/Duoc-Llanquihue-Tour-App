package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * Clase encargada de crear instancias de prueba
 * de los distintos servicios turísticos.
 *
 * @author Michael Salgado
 * @since 1.2.0
 */
public class GestorServicios {

    /**
     * Muestra las rutas gastronómicas disponibles.
     */
    public void mostrarRutasGastronomicas() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Ruta Sabores del Sur",
                4,
                5
        );

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta Cervecera",
                3,
                4
        );

        System.out.println("-----[RUTAS GASTRONÓMICAS]-----");
        System.out.println(ruta1);
        System.out.println(ruta2);
    }

    /**
     * Muestra los paseos lacustres disponibles.
     */
    public void mostrarPaseosLacustres() {

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Lago Llanquihue",
                2,
                "Catamarán"
        );

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Bahía Puerto Varas",
                3,
                "Lancha"
        );

        System.out.println("-----[PASEOS LACUSTRES]-----");
        System.out.println(paseo1);
        System.out.println(paseo2);
    }

    /**
     * Muestra las excursiones culturales disponibles.
     */
    public void mostrarExcursionesCulturales() {

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Frutillar Histórico",
                5,
                "Museo Colonial Alemán"
        );

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Puerto Montt Patrimonial",
                4,
                "Catedral de Puerto Montt"
        );

        System.out.println("-----[EXCURSIONES CULTURALES]-----");
        System.out.println(excursion1);
        System.out.println(excursion2);
    }

}