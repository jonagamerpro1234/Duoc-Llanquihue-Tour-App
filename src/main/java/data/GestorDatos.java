package data;

import model.Tour;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  Clase GestorDatos
 *  Permite gestionar los datos del archivo tour.txt
 */
public class GestorDatos {

    private final String fileName = "src/main/resources/tour.txt";

    /**
     * Verifica que el archivo exista y contenga datos.
     * Si no existe se crea y si está vacío se cargan datos por defecto.
     *
     * @return true si la verificación fue exitosa.
     */
    private boolean verificarArchivo() {

        try {

            File file = new File(fileName);

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Archivo creado correctamente.");
            }

            String linea;

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                linea = reader.readLine();
            }

            if (linea == null) {
                defaultData(file);
                System.out.println("Archivo inicializado con datos por defecto.");
            }

            return true;

        } catch (IOException e) {
            System.out.println("Error al verificar el archivo: " + e.getMessage());
            return false;
        }
    }

    /**
     * Carga datos por defecto cuando el archivo está vacío.
     *
     * @param file archivo a inicializar
     * @throws IOException error de escritura
     */
    private void defaultData(File file) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("Volcan Osorno;Aventura;35000;8;20;Ascenso guiado");
            writer.newLine();
            //---
            writer.write("Frutillar Colonial;Cultural;18000;4;15;Tour patrimonial");
            writer.newLine();
            //---
            writer.write("Ruta Gastronomica;Gastronomico;22000;3;0;Comida tipica");
            writer.newLine();
            //---
            writer.write("Saltos del Petrohue;Naturaleza;28000;6;12;Senderismo y vistas");
            writer.newLine();
            //---
            writer.write("Tour Lago Llanquihue;Lacustre;25000;5;25;Recorrido lacustre");
        }
    }

    /**
     * Obtiene todas las líneas del archivo.
     *
     * @return lista con los datos del archivo
     */
    public List<String> getDataFile() {

        if (!verificarArchivo()) {
            return new ArrayList<>();
        }

        List<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                data.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al obtener los datos del archivo: " + e.getMessage());
        }

        return data;
    }


    /**
     * Convierte los datos del archivo en objetos Tour.
     *
     * @return lista de tours
     */
    public ArrayList<Tour> getTours() {
        ArrayList<Tour> tours = new ArrayList<>();

        for (String linea : getDataFile()) {

            String[] datos = linea.split(";");

            if (datos.length != 6) {
                System.out.println("Línea inválida ignorada: " + linea);
                continue;
            }

            try {

                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);
                int duracion = Integer.parseInt(datos[3]);
                int cupos = Integer.parseInt(datos[4]);
                String descripcion = datos[5];

                tours.add(new Tour(nombre,descripcion,tipo,precio,duracion,cupos));

            } catch (NumberFormatException e) {
                System.out.println("Error al convertir datos en la línea: " + linea);
            }
        }

        return tours;
    }

}
