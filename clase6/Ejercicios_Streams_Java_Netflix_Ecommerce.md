# Ejercicios Guiados de Streams en Java

## Introducción

El objetivo de estos ejercicios es practicar el uso de Streams en escenarios inspirados en plataformas reales. La intención no es memorizar métodos, sino aprender a transformar requisitos de negocio en operaciones sobre colecciones.

---

# Ejercicio Guiado 1: Netflix - Explorando el Catálogo con Streams

## Objetivo

Construir consultas sobre un catálogo de películas utilizando Streams para responder preguntas típicas que un usuario podría realizar dentro de una plataforma como Netflix.

---

## Contexto

Netflix almacena miles de películas y series. Cada una tiene información que permite filtrarla, ordenarla y clasificarla.

Tu equipo debe desarrollar algunas funcionalidades básicas del catálogo.

---

## Paso 1: Diseña la clase `Pelicula`

Piensa qué información necesita Netflix para mostrar una película.

Puedes comenzar con atributos como:

```java
private String titulo;
private String genero;
private int duracion;
private double calificacion;
private int anioEstreno;
```

### Preguntas para reflexionar

- ¿Por qué la duración podría almacenarse como entero?
- ¿La calificación debería ser un entero o un decimal?
- ¿Qué otras propiedades podría tener una película real?

---

## Paso 2: Construye un catálogo de prueba

Crea una lista con al menos 8 películas.

Intenta incluir:

- distintos géneros
- distintas duraciones
- distintas calificaciones
- distintos años de estreno

Ejemplo de géneros:

- Acción
- Drama
- Comedia
- Ciencia Ficción
- Terror

---

## Desafío 1: Películas largas

### Requerimiento

Netflix desea identificar películas cuya duración sea superior a 120 minutos.

### Pistas

Pregúntate:

> ¿Necesito transformar datos o solamente seleccionar algunos?

Piensa en:

```java
stream()
```

y una operación que permita decidir cuáles permanecen y cuáles no.

---

## Desafío 2: Películas bien calificadas

### Requerimiento

Mostrar únicamente películas cuya calificación sea superior a 4.5.

### Pistas

- ¿Qué operación sirve para filtrar elementos?
- ¿Qué condición debe cumplir cada película?

Intenta expresar la condición usando una expresión lambda.

---

## Desafío 3: Ordenar por calificación

### Requerimiento

Mostrar las películas desde la mejor calificada hasta la peor.

### Preguntas guía

- ¿Qué operación permite ordenar?
- ¿Qué clase de Java ayuda a definir criterios de ordenamiento?
- ¿Cómo invertir el orden para obtener descendente?

---

## Desafío 4: Estrenos recientes

### Requerimiento

Mostrar películas estrenadas después de 2020.

### Reflexión

Si mañana el año cambia:

- ¿seguiría funcionando la lógica?
- ¿podría hacerse más flexible?

---

## Desafío 5: La película mejor calificada

### Requerimiento

Encontrar una única película: la mejor valorada por los usuarios.

### Preguntas

- ¿Necesitas ordenar toda la lista?
- ¿Existe una operación que encuentre directamente el máximo?

---

## Desafío 6: Catálogo Premium

### Requerimiento

Mostrar películas que:

- tengan calificación superior a 4.0
- duren menos de 150 minutos

### Reflexión

¿Cómo combinarías múltiples condiciones dentro de una misma consulta?

---

## Desafío 7: Recomendaciones Netflix

Netflix quiere mostrar primero las películas mejor calificadas.

Si dos películas tienen la misma calificación:

- debe aparecer primero la más reciente

### Preguntas

- ¿Cómo definir dos criterios de ordenamiento?
- ¿Cuál es el criterio principal?
- ¿Cuál es el criterio secundario?

---

# Ejercicio Guiado 2: Ecommerce - Catálogo de Productos

## Objetivo

Simular funcionalidades típicas de una tienda virtual utilizando Streams.

---

## Contexto

Trabajas para una tienda online que vende productos tecnológicos.

El equipo necesita implementar búsquedas, filtros y rankings para mejorar la experiencia del usuario.

---

## Paso 1: Diseña la clase `Producto`

Puedes comenzar con:

```java
private String nombre;
private String categoria;
private double precio;
private double calificacion;
private int stock;
```

### Reflexiona

¿Por qué un ecommerce necesita:

- precio?
- stock?
- calificación?

¿Qué decisiones toma un cliente con cada dato?

---

## Paso 2: Construye el catálogo

Agrega al menos 10 productos.

Ejemplos:

- Laptop
- Monitor
- Teclado
- Mouse
- Audífonos
- Tablet
- Smartwatch
- Cámara
- Impresora
- Micrófono

---

## Desafío 1: Productos económicos

### Requerimiento

Mostrar únicamente productos con precio inferior a $200.

### Preguntas

- ¿Qué operación usarías para descartar los más costosos?
- ¿Qué condición debe evaluarse?

---

## Desafío 2: Productos disponibles

### Requerimiento

Mostrar únicamente productos con stock mayor a cero.

### Reflexión

¿Por qué una tienda no debería mostrar productos agotados?

---

## Desafío 3: Los más baratos primero

### Requerimiento

Ordenar productos por precio ascendente.

### Preguntas

- ¿Qué atributo será utilizado como criterio?
- ¿Cómo indicarías que el orden sea de menor a mayor?

---

## Desafío 4: Los mejores valorados

### Requerimiento

Mostrar productos ordenados desde la mejor calificación hasta la peor.

### Pistas

Piensa en:

- ordenamiento
- comparadores
- inversión del orden

---

## Desafío 5: Producto más costoso

### Requerimiento

Encontrar el producto más caro del catálogo.

### Reflexión

¿Necesitas ordenar toda la lista para responder esta pregunta?

---

## Desafío 6: Catálogo Gamer

### Requerimiento

Mostrar productos que:

- pertenezcan a la categoría "Gaming"
- tengan calificación superior a 4.0

### Preguntas

- ¿Cómo combinarías varias condiciones?
- ¿Es mejor usar un único filtro o varios?

---

## Desafío 7: Productos recomendados

La tienda quiere mostrar productos usando esta prioridad:

1. Mejor calificación.
2. Si empatan, menor precio.

### Análisis previo

Imagina:

- Mouse Gamer — 4.8 — $120
- Teclado Gamer — 4.8 — $80

¿Cuál debería aparecer primero?

¿Por qué?

Ahora intenta traducir esa regla de negocio a Streams.

---

## Desafío Final: Página Principal del Ecommerce

La página principal debe mostrar productos que:

- tengan stock disponible
- tengan calificación superior a 4.0
- ordenar por calificación descendente
- en empate, ordenar por precio ascendente

Antes de escribir código, dibuja el flujo:

```text
Catálogo completo
       ↓
 ¿Qué filtro aplicarías primero?
       ↓
 ¿Qué filtro aplicarías después?
       ↓
 ¿Cómo ordenarías?
       ↓
 Resultado final
```

## Cierre

La meta de ambos ejercicios no es memorizar métodos de Streams, sino aprender a convertir reglas de negocio reales en una secuencia de operaciones sobre datos. Ese es exactamente el tipo de razonamiento que utilizan plataformas modernas como Netflix, Amazon, Mercado Libre o Uber Eats internamente.
