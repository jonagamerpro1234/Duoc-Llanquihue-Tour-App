package model;

import org.jetbrains.annotations.NotNull;
import util.InvalidRutException;

/**
 * La clase rut permite validar y almacenar el RUT de la persona
 * @author Michael Salgado
 * @since 1.1.0
 */
public class Rut {

    private final String numero;

    /**
     * Crea un nuevo objeto Rut.
     * <p>
     * El valor ingresado debe respetar el formato:
     * números, guion y dígito verificador.
     * <p>
     * Ejemplo:
     * 12345678-9
     *
     * @param rut RUT a almacenar
     * @throws InvalidRutException si el formato no es válido
     */
    public Rut(@NotNull String rut)  {

        if(!rut.matches("[0-9]+-[0-9kK]")){
            throw new InvalidRutException("El RUT ingresado no es válido.");
        }
        this.numero = rut;
    }

    /**
     * Retorna el RUT almacenado.
     *
     * @return RUT en formato 12345678-9
     */
    public String getRut() {
        return numero;
    }

    @Override
    public String toString() {
        return this.numero;
    }
}