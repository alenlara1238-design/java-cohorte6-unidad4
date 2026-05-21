# Ejercicios Guiados — Map y HashMap en Java

## Nivel 1 — Reconociendo la estructura

### Ejercicio 1 — ¿Qué representa?

```java
Map<String, Integer> edades = new HashMap<>();
```

- ¿Qué tipo representa la clave?
- ¿Qué tipo representa el valor?
- ¿Qué podría almacenar este mapa?

---

### Ejercicio 2 — Interpreta el mapa

```java
Map<String, Double> productos = new HashMap<>();
```

```java
productos.put("Laptop", 3500.0);
productos.put("Mouse", 80.0);
```

- ¿Qué representa "Laptop"?
- ¿Qué representa 3500.0?

---

## Nivel 2 — Insertando correctamente

### Ejercicio 3 — Completa el put()

```java
Map<String, Integer> inventario = new HashMap<>();
```

Inserta:

```text
Teclado -> 15
```

```java
inventario.put( __________ );
```

---

### Ejercicio 4 — Detecta el error

```java
Map<String, Integer> edades = new HashMap<>();

edades.put(20, "Ana");
```

- ¿Qué error conceptual existe?
- ¿Qué tipos están invertidos?

---

### Ejercicio 5 — Analiza antes de escribir

```java
Map<Integer, String> empleados = new HashMap<>();
```

Guardar:

```text
1001 -> Carlos
```

```java
empleados.put( __________ );
```

---

## Nivel 3 — Comprensión de claves y valores

### Ejercicio 6 — ¿Qué devuelve?

```java
Map<String, Integer> notas = new HashMap<>();

notas.put("Ana", 90);
notas.put("Luis", 75);
```

```java
notas.get("Ana");
```

---

### Ejercicio 7 — Predice el resultado

```java
Map<String, Integer> productos = new HashMap<>();

productos.put("Mouse", 10);
productos.put("Mouse", 50);
```

- ¿Cuántos elementos quedan?
- ¿Qué valor tendrá "Mouse"?

---

### Ejercicio 8 — ¿Existe la clave?

```java
Map<String, Double> precios = new HashMap<>();
```

Verifica si existe:

```text
Laptop
```

---

## Nivel 4 — Recorridos

### Ejercicio 9 — Completa el for-each

```java
for ( __________________________ ) {

}
```

---

### Ejercicio 10 — Identifica qué devuelve

```java
edades.keySet()
```

- claves
- valores
- pares clave-valor

---

### Ejercicio 11 — Analiza el recorrido

```java
for (String clave : mapa.keySet()) {

    System.out.println(clave);
}
```

- ¿Qué se imprime?
- ¿Claves o valores?

---

## Nivel 5 — Objetos en HashMap

### Ejercicio 12 — Interpreta la estructura

```java
Map<String, Producto> inventario = new HashMap<>();
```

- ¿Qué representa la clave?
- ¿Qué representa el valor?

---

### Ejercicio 13 — Completa correctamente

```java
Producto p = new Producto("Laptop", 3500, 5);
```

```java
inventario.put( __________________ );
```

---

### Ejercicio 14 — Analiza el get()

```java
Producto producto = inventario.get("A100");
```

- ¿Qué devuelve get()?
- ¿Qué pasaría si no existe?

---

## Nivel 6 — Análisis y debate

### Ejercicio 15 — ¿List o Map?

Buscar rápidamente un usuario por email.

```text
A) List<Usuario>
B) Map<String, Usuario>
```

Justifica.

---

### Ejercicio 16 — Detecta mala elección

```java
List<Producto>
```

usado para buscar productos por código constantemente.

- ¿Qué problema puede aparecer?
- ¿Qué estructura sería mejor?

---

### Ejercicio 17 — Predicción de comportamiento

```java
Map<String, Integer> mapa = new HashMap<>();

mapa.put("A", 1);
mapa.put("B", 2);
mapa.put("A", 9);
```

- ¿Cuántos elementos hay?
- ¿Qué valor tiene "A"?

---

## Nivel 7 — Pensamiento tipo framework

### Ejercicio 18 — Relación real

¿Qué estructura usaría mejor un sistema de login?

```text
usuario -> contraseña
```

Opciones:

- List
- Set
- Map

---

### Ejercicio 19 — JSON y Map

```json
{
  "nombre": "Ana",
  "edad": 20
}
```

¿Por qué podría representarse como?

```java
Map<String, Object>
```

---

## Nivel 8 — Comprensión profunda

### Ejercicio 20 — Análisis conceptual

¿Por qué suele ser rápida esta operación?

```java
mapa.get(clave);
```

Habla sobre:

- hashCode
- buckets
- búsqueda directa

---

### Ejercicio 21 — Detecta el problema

```java
Map<String, Integer> mapa = new HashMap<>();

mapa.put(null, 10);
```

- ¿Es válido en HashMap?
- ¿Todas las implementaciones lo permiten?

---

### Ejercicio 22 — Reflexión final

```text
List almacena __________

Set almacena __________

Map almacena __________
```
