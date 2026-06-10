# Ejercicio Integrador: Plataforma de Gestión de Eventos

## Objetivo

Desarrollar una aplicación de consola en **Java** aplicando Programación
Orientada a Objetos, arquitectura por capas y **Streams** para consultar
y procesar información de eventos.

------------------------------------------------------------------------

## Objetivos de aprendizaje

Al finalizar este ejercicio el estudiante será capaz de:

-   Diseñar clases siguiendo el paradigma orientado a objetos.
-   Organizar un proyecto por capas.
-   Manipular colecciones usando Streams.
-   Utilizar:
    -   `filter()`
    -   `map()`
    -   `toList()`
    -   `Collectors.toSet()`
    -   `Collectors.toMap()`
    -   `Collectors.groupingBy()`
-   Mostrar información mediante una interfaz de consola.

------------------------------------------------------------------------

# Contexto

Una empresa organiza diferentes eventos culturales, deportivos,
musicales y tecnológicos en distintas ciudades.

La empresa necesita una aplicación que permita consultar rápidamente la
información de estos eventos mediante Streams.

La información estará almacenada en memoria utilizando una lista
(`List<Evento>`), simulando una base de datos.

------------------------------------------------------------------------

# Estructura del proyecto

``` text
src/
│
├── model/
│     Evento.java
│
├── repository/
│     EventoRepository.java
│
├── service/
│     EventoService.java
│
├── ui/
│     Consola.java
│
└── Main.java
```

------------------------------------------------------------------------

# Modelo

Crear la clase `Evento` con los siguientes atributos:

  Atributo           Tipo
  ------------------ --------
  codigo             int
  nombre             String
  categoria          String
  ciudad             String
  precioEntrada      double
  cuposDisponibles   int

La clase debe incluir:

-   Constructor
-   Getters
-   Método `toString()`

------------------------------------------------------------------------

# Repository

Crear la clase `EventoRepository`.

Su responsabilidad será **simular una base de datos**, almacenando una
colección de eventos.

Debe contener un método:

``` java
public List<Evento> obtenerTodos()
```

Este método devolverá la lista completa de eventos.

------------------------------------------------------------------------

# Service

Toda la lógica del programa debe implementarse utilizando Streams.

Implemente los siguientes métodos:

## 1. Listar todos los eventos

``` java
listarEventos()
```

------------------------------------------------------------------------

## 2. Mostrar únicamente los eventos gratuitos

Utilice:

``` java
filter()
```

------------------------------------------------------------------------

## 3. Mostrar únicamente los eventos que aún tienen cupos disponibles

Utilice:

``` java
filter()
```

------------------------------------------------------------------------

## 4. Buscar eventos por categoría

Debe recibir la categoría como parámetro.

Ejemplo:

    Tecnología
    Música
    Cultural

Utilice:

``` java
filter()
```

------------------------------------------------------------------------

## 5. Buscar eventos por ciudad

Debe recibir el nombre de la ciudad.

Utilice:

``` java
filter()
```

------------------------------------------------------------------------

## 6. Obtener todas las categorías disponibles

No deben repetirse.

Utilice:

``` java
map()
Collectors.toSet()
```

------------------------------------------------------------------------

## 7. Obtener todas las ciudades disponibles

No deben repetirse.

Utilice:

``` java
map()
Collectors.toSet()
```

------------------------------------------------------------------------

## 8. Crear un mapa Nombre → Precio

Resultado esperado:

    Java Day -> 0
    Python Summit -> 120000
    Comic Con -> 90000
    ...

Utilice:

``` java
Collectors.toMap()
```

------------------------------------------------------------------------

## 9. Agrupar eventos por categoría

Resultado esperado:

    Tecnología
        Java Day
        Python Summit
        Expo Videojuegos

    Cultural
        Feria del Libro
        Festival del Río

Utilice:

``` java
Collectors.groupingBy()
```

------------------------------------------------------------------------

# Interfaz de usuario

Implemente un menú de consola similar al siguiente:

``` text
========= PLATAFORMA DE EVENTOS =========

1. Listar eventos
2. Eventos gratuitos
3. Eventos con cupos
4. Buscar por categoría
5. Buscar por ciudad
6. Categorías disponibles
7. Ciudades disponibles
8. Nombre -> Precio
9. Agrupar por categoría
0. Salir
```

Cada opción deberá invocar el método correspondiente del servicio.

