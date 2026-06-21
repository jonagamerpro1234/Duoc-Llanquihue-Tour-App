package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * @author Michael Salgado
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        GestorDatos  gd = new GestorDatos();

        ArrayList<Tour> tours = gd.getTours();

        System.out.println("-----[Todo Los TOURS]-----");
        for(Tour tour : tours){
            System.out.println(tour);
        }

        System.out.println("-----[TOURS Con Cupos Disponibles]-----");

        for(Tour tour : tours){

            if(tour.getCuposDisponibles() > 0){
                System.out.println(tour);
            }

        }
    }

}
