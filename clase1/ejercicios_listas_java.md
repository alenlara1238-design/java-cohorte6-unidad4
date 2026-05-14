# Ejercicios Guiados de Listas (ArrayList y LinkedList) en Java

## 1. Mi lista de deseos (Declaración e Instanciación)

### Objetivo
Declarar y crear una lista dinámica de tipo `String`.

### Enunciado
Crea una lista llamada `deseos`. Agrega 4 cosas que te gustaría comprar o hacer este año. Imprime la lista completa y muestra cuántos elementos tiene usando el método adecuado.

---

## 2. Gestión de invitados (Modificación dinámica)

### Objetivo
Agregar, remover y verificar elementos.

### Enunciado
Crea una `ArrayList` de invitados.

- Agrega a `"Ana"`, `"Pedro"` y `"Lucía"`.
- Pedro avisa que no puede ir: elimínalo de la lista por su nombre.
- Verifica si `"Ana"` todavía está en la lista e imprime el resultado (`true/false`).

---

## 3. Registro de vueltas de un corredor (ArrayList vs LinkedList)

### Objetivo
Entender la inserción en diferentes posiciones.

### Enunciado
Un corredor registra sus tiempos. Crea una `LinkedList` de tiempos (`Double`).

- Agrega tres tiempos al final: `12.5`, `13.2`, `11.8`.
- El corredor olvidó registrar una vuelta inicial: inserta `10.9` en la posición `0`.
- Imprime la lista para ver el nuevo orden.

---

## 4. Carrito de compras (Recorrido con For-each)

### Objetivo
Iterar sobre una lista de objetos.

### Enunciado
Crea una lista de precios con los valores:

```java
{15.99, 5.50, 42.0, 10.0}
```

Usa un ciclo `for-each` para calcular el total de la compra e imprimirlo con un mensaje:

```text
Total a pagar: $XXX
```

---

## 5. Ranking de videojuegos (Acceso por índice)

### Objetivo
Obtener y reemplazar elementos específicos.

### Enunciado
Crea una lista con el Top 3 de tus juegos favoritos.

- Imprime el juego que está en el puesto #1 (índice `0`).
- El juego en el puesto #2 ha sido superado por uno nuevo: usa `.set()` para cambiar el nombre del segundo juego por otro diferente.

---

## 6. Filtro de nombres cortos (Condicionales y Remoción)

### Objetivo
Filtrar una lista basándose en una condición.

### Enunciado
Crea una lista con nombres de ciudades:

```java
{"Bogotá", "Lima", "Rio", "La Paz", "Cali"}
```

Recorre la lista y, si el nombre de la ciudad tiene 4 letras o menos, imprímelo indicando que es una:

```text
Ciudad de nombre corto
```

---

## 7. Limpieza de base de datos (Método clear y isEmpty)

### Objetivo
Aprender a vaciar colecciones y verificar su estado.

### Enunciado
Simula una lista de `mensajesPendientes` con 3 textos.

- Imprime si la lista tiene mensajes.
- Vacía la lista por completo.
- Vuelve a comprobar si está vacía e imprime un mensaje confirmando que:

```text
Bandeja de entrada limpia
```

---

## 8. Sorteo rápido (Uso de Collections.sort)

### Objetivo
Ordenar una lista alfabética o numéricamente.

### Enunciado
Crea una lista de frutas desordenadas:

```java
"Pera", "Manzana", "Ananá", "Uva"
```

Usa la clase utilidad `Collections` para ordenar la lista alfabéticamente e imprímela.

---

## 9. Fila del Banco - Triage (Uso de métodos de LinkedList)

### Objetivo
Usar métodos específicos de la implementación `LinkedList`.

### Enunciado
Crea una `LinkedList` de clientes.

- Agrega a `"Cliente A"` y `"Cliente B"`.
- Llega un `"Cliente VIP"`: agrégalo al puro inicio con `.addFirst()`.
- Atiende al primer cliente de la fila eliminándolo con `.removeFirst()` y muestra quién fue atendido.

---

## 10. Conversión de Array a List (Interoperabilidad)

### Objetivo
Aprender a transformar un arreglo estático en una lista dinámica.

### Enunciado
Tienes un arreglo fijo:

```java
String[] colores = {"Rojo", "Verde", "Azul"};
```

Convierte ese arreglo en una `ArrayList` llamada `listaColores`. Luego, añade un color más (`"Amarillo"`) para demostrar que ahora la lista sí puede crecer.

---

# Tips para trabajar con Listas en Java

## La Interfaz es el contrato

Siempre es buena práctica declarar la lista usando la interfaz:

```java
List<String> lista = new ArrayList<>();
```

Esto te permite cambiar de `ArrayList` a `LinkedList` después sin romper tu código.

---

## Métodos Imprescindibles

### `.add(E e)`
Añade un elemento al final.

### `.get(int index)`
Obtiene el elemento (como `array[i]`).

### `.size()`
El equivalente a `.length` en arrays.

### `.remove(Object o)` o `.remove(int index)`
Elimina por objeto o posición.

---

## Métodos Curiosos y Útiles

### `.contains(Object o)`
Devuelve `true` si el elemento existe. ¡Súper útil para búsquedas!

### `.indexOf(Object o)`
Te dice en qué posición está un elemento.

### `.subList(int from, int to)`
Extrae un pedazo de la lista como si fuera una lista nueva.

---

## Collections: Tu mejor amigo

La clase `java.util.Collections` tiene métodos estáticos geniales como:

- `.sort(lista)` → Ordenar
- `.reverse(lista)` → Invertir
- `.shuffle(lista)` → Mezclar aleatoriamente

---

## ArrayList vs LinkedList: La regla de oro

- ¿Muchos `.get(i)`? → Usa `ArrayList`.
- ¿Muchos `.add(0, elemento)` o `.remove(0)`? → Usa `LinkedList`.

---

## Evita el tipo crudo (Raw Types)

Siempre usa diamantes `<>` para indicar el tipo de dato:

```java
List<Integer>
```

Si no lo haces, Java aceptará cualquier objeto y tu código será propenso a errores.

---

# Documentación Oficial (Oracle Java)

- Documentación de la Interfaz `List`
- Documentación de `ArrayList`
- Documentación de `LinkedList`
