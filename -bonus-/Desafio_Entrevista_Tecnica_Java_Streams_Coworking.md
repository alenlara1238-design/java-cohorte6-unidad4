#  DESAFÍO DE ENTREVISTA TÉCNICA

# **¿Serías contratado? Diseña una Plataforma de Gestión de Espacios de Coworking usando Java y Streams**

## Contexto

Durante una entrevista técnica para una empresa de desarrollo de
software, el entrevistador plantea el siguiente problema.

Una empresa administra decenas de espacios de coworking distribuidos por
diferentes ciudades. Cada espacio ofrece distintos servicios y
características, y los usuarios desean encontrar rápidamente el lugar
que mejor se adapte a sus necesidades.

Actualmente toda la información se encuentra almacenada en memoria, pero
el entrevistador aclara que en un futuro podría migrarse a una base de
datos, por lo que espera que el diseño del software facilite esa
transición.

No existe una interfaz gráfica; basta con una aplicación de consola.

El entrevistador **no indica cómo organizar el proyecto ni qué clases
crear**. Espera que tú propongas una solución limpia y bien
estructurada.

------------------------------------------------------------------------

# Objetivos de aprendizaje

Al finalizar este reto serás capaz de:

-   Analizar un problema antes de comenzar a programar.
-   Diseñar una solución siguiendo Programación Orientada a Objetos.
-   Proponer una arquitectura por capas.
-   Aplicar Streams para consultar información.
-   Justificar decisiones de diseño como en una entrevista técnica.
-   Desarrollar una aplicación mantenible y escalable.

------------------------------------------------------------------------

# El modelo de datos

Cada espacio de coworking posee la siguiente información:

-   Código
-   Nombre
-   Ciudad
-   Tipo de espacio
-   Capacidad
-   Precio por día
-   Disponible (sí/no)

------------------------------------------------------------------------

# Lo que el cliente necesita

La empresa desea poder realizar las siguientes consultas:

1.  Mostrar todos los espacios registrados.
2.  Mostrar únicamente los espacios disponibles.
3.  Mostrar únicamente los espacios cuya capacidad sea mayor o igual a
    un valor indicado.
4.  Buscar espacios por ciudad.
5.  Buscar espacios por tipo de espacio.
6.  Obtener todas las ciudades disponibles sin repetir.
7.  Obtener todos los tipos de espacio sin repetir.
8.  Crear un mapa donde la llave sea el nombre del espacio y el valor
    sea el precio por día.
9.  Agrupar los espacios por ciudad.
10. Obtener el precio promedio de todos los espacios disponibles.

------------------------------------------------------------------------

# Restricciones de la entrevista

El entrevistador únicamente menciona las siguientes condiciones:

-   Toda la información debe almacenarse inicialmente en memoria.
-   Deben utilizarse Streams para realizar las consultas.
-   Debe aplicarse Programación Orientada a Objetos.
-   El código debe ser fácil de mantener.
-   Debe existir una separación clara entre la lógica del negocio y la
    presentación.

No proporciona más instrucciones.

------------------------------------------------------------------------

# Tu reto

Como candidato debes proponer una solución completa.

## 1. Diseño de clases

¿Qué clases crearías?

Justifica brevemente la responsabilidad de cada una.

------------------------------------------------------------------------

## 2. Arquitectura

¿Cómo organizarías el proyecto?

Propón una estructura de carpetas.

------------------------------------------------------------------------

## 3. Persistencia

¿Qué clase sería responsable de almacenar la información?

¿Por qué?

------------------------------------------------------------------------

## 4. Lógica del negocio

¿Dónde implementarías las consultas utilizando Streams?

Explica tu decisión.

------------------------------------------------------------------------

## 5. Diseño del servicio

¿Qué métodos tendría la clase encargada de la lógica del negocio?

Escribe únicamente sus firmas.

Ejemplo:

``` java
public List<...> ...
```

------------------------------------------------------------------------

## 6. Streams

Relaciona cada necesidad con la operación de Streams que utilizarías.

Ejemplo:

  Consulta            Stream
  ------------------- ----------------------------
  Buscar por ciudad   filter()
  Obtener ciudades    map() + Collectors.toSet()

------------------------------------------------------------------------

## 7. Interfaz de usuario

Diseña el menú de consola que ofrecerías al usuario.

No es necesario implementarlo.

------------------------------------------------------------------------

## 8. Escalabilidad

Si dentro de seis meses la empresa decide reemplazar la lista en memoria
por una base de datos:

-   ¿Qué cambiaría?
-   ¿Qué clases permanecerían iguales?
-   ¿Por qué tu diseño facilitaría esa migración?

------------------------------------------------------------------------

# Pistas

Puedes utilizar, entre otras, las siguientes operaciones de Streams:

-   filter()
-   map()
-   toList()
-   Collectors.toSet()
-   Collectors.toMap()
-   Collectors.groupingBy()
-   average()

No es obligatorio utilizar todas.

------------------------------------------------------------------------

# Criterios de evaluación

El entrevistador evaluará:

-   Diseño orientado a objetos.
-   Organización del proyecto.
-   Separación de responsabilidades.
-   Uso adecuado de Streams.
-   Claridad y legibilidad del código.
-   Justificación de las decisiones de diseño.
-   Facilidad para mantener y ampliar la aplicación.

------------------------------------------------------------------------

# 💡 Consejo

En una entrevista técnica no siempre gana quien escribe código más
rápido.

Con frecuencia, los mejores candidatos son quienes **analizan el
problema, justifican sus decisiones y construyen una solución limpia,
organizada y fácil de mantener**.

**¡Piensa como un desarrollador profesional antes de comenzar a
programar!**
