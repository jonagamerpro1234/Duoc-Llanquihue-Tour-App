package util;

import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * Clase que proporciona herramientas para la gestión de archivos.
 *
 * @author Michael Salgado
 * @since 1.1.0
 */
public final class FileUtil {

    private FileUtil() {
    }

    /**
     * Verifica si un archivo existe.
     *
     * @param path ruta del archivo
     * @return true si existe, false en caso contrario
     */
    public static boolean fileExist(String path) {
        return new File(path).exists();
    }

    /**
     * Verifica si un archivo está vacío.
     *
     * @param file archivo a verificar
     * @return true si está vacío, false en caso contrario
     */
    public static boolean isEmpty(@NotNull File file) {
        return file.length() == 0;
    }
}