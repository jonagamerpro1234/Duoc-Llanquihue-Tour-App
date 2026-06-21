package util;

/**
 *  Excepción Personalizada para el RUT
 * <p>
 * Como su nombre lo menciona al encontrar una excepción
 * del rol unico tributario arroja un error indicando que no es válido
 * esto puede ser por varios motivos principalmente no cumplir con el patters que verifica si
 * está dentro de cierto rango de números y letras como tal seria est [0-9] - [kK] esto sería lo que define el formato en sí
 *
 */
public class InvalidRutException extends RuntimeException {

    public InvalidRutException(String message) {
        super(message);
    }
}