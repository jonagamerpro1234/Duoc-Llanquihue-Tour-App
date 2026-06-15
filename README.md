<p align="left">
  <img src="https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png" width="300"/>
</p>

# 🧠 S4 - Llanquihue Tour

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I (PRY2202)** de Duoc UC.

---

## 📖 Descripción

Este proyecto implementa un sistema simple para la gestión de tours turísticos utilizando Programación Orientada a Objetos en Java.

La aplicación lee información desde un archivo de texto, crea objetos de tipo Tour y los almacena en una colección ArrayList para posteriormente realizar recorridos y filtrados de información.

Se aplican conceptos fundamentales como:

* Clases y Objetos
* Encapsulamiento
* Colecciones (ArrayList)
* Lectura de archivos
* Manejo de datos mediante archivos externos
* Métodos getter y setter
* Método toString()

El caso de estudio corresponde a la agencia de turismo **Llanquihue Tour**.

---

## 📁 Estructura del Proyecto

```text
src/
├── model/
│   └── Tour.java
│
├── data/
│   └── GestorDatos.java
│
└── ui/
    └── Main.java

resources/
└── tours.txt
```

---

## 🚀 Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
3. Compilar el proyecto.
4. Ejecutar la clase `Main`.
5. Revisar la salida generada por consola.

---

## 🧩 Clases Implementadas

### Tour

Representa un tour turístico e incluye atributos como nombre, tipo y precio.

### GestorDatos

Clase encargada de leer el archivo `tours.txt`, procesar los datos y generar los objetos Tour.

### Main

Clase principal que permite:

* Cargar los datos desde el archivo.
* Mostrar todos los tours almacenados.
* Filtrar tours según una condición.
* Mostrar los resultados por consola.

---

## 📄 Archivo de Datos

El archivo `tours.txt` contiene la información de los tours utilizando el siguiente formato:

```text
Tour Lago Llanquihue;Lacustre;25000
Volcan Osorno;Aventura;35000
Frutillar Colonial;Cultural;18000
Ruta Gastronomica;Gastronomico;22000
Saltos del Petrohue;Naturaleza;28000
```

---

## ☕ Requisitos

* Java JDK 25 o superior.
* IntelliJ IDEA Community Edition.

---

## 👨‍💻 Autor

Michael Salgado

Desarrollo Orientado a Objetos I - Duoc UC
