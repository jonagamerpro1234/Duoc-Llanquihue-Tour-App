<p>
  <img src="https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png" width="300" alt=""/>
</p>

# 🧠 Llanquihue Tour App

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I (PRY2202)** de Duoc UC.

---

## 📖 Descripción

Este proyecto implementa un sistema simple para la gestión de tours turísticos utilizando Programación Orientada a Objetos en Java.

La aplicación lee información desde un archivo de texto (`tour.txt`), crea objetos de tipo `Tour` y los almacena en una colección `ArrayList` para posteriormente realizar recorridos y filtrados de información.

Durante el desarrollo se aplican conceptos fundamentales como:

* Clases y Objetos.
* Encapsulamiento.
* Colecciones (`ArrayList`).
* Lectura y escritura de archivos.
* Manejo de datos mediante archivos externos.
* Métodos Getter y Setter.
* Método `toString()`.

El caso de estudio corresponde a la agencia de turismo **Llanquihue Tour**.

---

## 📁 Estructura del Proyecto

```text
📁 src/
└── 📁 main/
    ├── 📁 java/
    │   ├── 📁 model/
    │   │   └── Tour.java
    │   │
    │   ├── 📁 data/
    │   │   └── GestorDatos.java
    │   │
    │   └── 📁 ui/
    │       └── Main.java
    │
    └── 📁 resources/
        └── tours.txt
```

---

## 🚀 Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tour.txt` se encuentre dentro de la carpeta `src/main/resources`.
3. Compilar el proyecto.
4. Ejecutar la clase `Main`.
5. Revisar la salida generada por consola.

---

## 🧩 Clases Implementadas

### Tour

Representa un tour turístico e incluye atributos como:

* Nombre.
* Descripción.
* Tipo.
* Precio.
* Duración.
* Cupos disponibles.

### GestorDatos

Clase encargada de:

* Verificar la existencia del archivo.
* Cargar datos por defecto cuando el archivo está vacío.
* Leer la información almacenada en `tour.txt`.
* Crear objetos `Tour` a partir de los datos obtenidos.

### Main

Clase principal que permite:

* Cargar los tours desde el archivo.
* Mostrar todos los tours registrados.
* Filtrar tours según una condición.
* Mostrar los resultados por consola.

---

## 📄 Archivo de Datos

El archivo `tour.txt` contiene la información de los tours utilizando el siguiente formato:

```text
Volcan Osorno;Aventura;35000;8;20;Ascenso guiado
Frutillar Colonial;Cultural;18000;4;15;Tour patrimonial
Ruta Gastronomica;Gastronomico;22000;3;0;Comida tipica
Saltos del Petrohue;Naturaleza;28000;6;12;Senderismo y vistas
Tour Lago Llanquihue;Lacustre;25000;5;25;Recorrido lacustre
```

Formato:

```text
Nombre;Tipo;Precio;DuracionHoras;CuposDisponibles;Descripcion
```

---

## ☕ Requisitos

* Java JDK 21 o superior.
* IntelliJ IDEA Community Edition.

---

## 👨‍💻 Autor

Michael Salgado 

Desarrollo Orientado a Objetos I - Duoc UC
