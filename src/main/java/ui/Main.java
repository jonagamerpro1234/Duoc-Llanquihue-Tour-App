package ui;

import data.GestorDatos;
import data.GestorServicios;
import model.Guia;
import model.Proveedor;
import model.Tour;
import org.jetbrains.annotations.NotNull;
import servicios.TourManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static GestorDatos gd;
    private static TourManager tm;
    private static GestorServicios gs;

    public static void main(String[] args) {

        gd = new GestorDatos();
        tm = new TourManager();
        gs = new GestorServicios();

        ArrayList<Tour> tours = gd.getTours();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("""
                    
                    ===== LLANQUIHUE TOUR =====
                    1. Ver todos los tours
                    2. Ver tours con cupos disponibles
                    3. Ver guías registrados
                    4. Ver proveedores registrados
                    5. Ver Servicios Turísticos
                    0. Salir
                    """);

            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Debe ingresar un número.");
                scanner.next();
                System.out.print("Seleccione una opción: ");
            }

            opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            showOptions(opcion,scanner,tours);

        } while (opcion != 0);

        scanner.close();
    }

    private static void showOptions(int opcion, Scanner scanner, ArrayList<Tour> tours) {
        switch (opcion) {
            case 1:
                System.out.println("-----[TODOS LOS TOURS]-----");
                tm.mostrarTours(tours);
                pausa(scanner);
                break;
            case 2:
                System.out.println("-----[TOURS CON CUPOS DISPONIBLES]-----");
                tm.mostrarTours(
                        tm.getToursDisponibles(tours)
                );
                pausa(scanner);
                break;
            case 3:
                System.out.println("-----[GUIAS REGISTRADOS]-----");

                for (Guia guia : gd.getGuias()) {
                    System.out.println(guia);
                }

                pausa(scanner);
                break;
            case 4:
                System.out.println("-----[PROVEEDORES REGISTRADOS]-----");

                for (Proveedor proveedor : gd.getProveedores()) {
                    System.out.println(proveedor);
                }

                pausa(scanner);
                break;
            case 5:
                System.out.println("-----[SERVICIOS TURÍSTICOS]-----");
                menuServicios(scanner);
                break;
            case 0:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción inválida.");
                pausa(scanner);
                break;
        }
    }

    /**
     * Muestra el submenú de servicios turísticos.
     * @param scanner scanner utilizado por la aplicación
     */
    private static void menuServicios(@NotNull Scanner scanner) {

        int opcion;

        do {

            System.out.println("""

                ===== SERVICIOS TURÍSTICOS =====
                1. Rutas Gastronómicas
                2. Paseos Lacustres
                3. Excursiones Culturales
                0. Volver
                """);

            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Debe ingresar un número.");
                scanner.next();
                System.out.print("Seleccione una opción: ");
            }

            opcion = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (opcion) {

                case 1:
                    gs.mostrarRutasGastronomicas();
                    pausa(scanner);
                    break;

                case 2:
                    gs.mostrarPaseosLacustres();
                    pausa(scanner);
                    break;

                case 3:
                    gs.mostrarExcursionesCulturales();
                    pausa(scanner);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opción inválida.");
                    pausa(scanner);
                    break;
            }

        } while (opcion != 0);

    }

    /**
     * Pausa la ejecución hasta que el usuario presione ENTER.
     * @param scanner scanner utilizado por la aplicación
     */
    private static void pausa(@NotNull Scanner scanner) {
        System.out.println("\nPresione ENTER para volver al menú...");
        scanner.nextLine();
    }

}