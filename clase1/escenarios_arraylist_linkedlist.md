# Escenarios Prácticos: ¿ArrayList o LinkedList?

---

## Escenario 1: El Sensor de Temperatura Industrial

### Enunciado
Estás programando un sistema que recibe la temperatura de una caldera cada segundo durante todo un año.

Los datos solo se añaden al final de la lista.

Al final del año, un analista querrá consultar rápidamente la temperatura de cualquier momento específico (por ejemplo:

```text
¿Cuál fue la temperatura en el segundo 15,500,321?
```

### Pregunta
¿Qué estructura usarías?

---

## Escenario 2: El Deshacer (Undo) de un Editor de Texto

### Enunciado
Estás diseñando la función "Deshacer" (`Ctrl + Z`) de un editor de texto.

Cada vez que el usuario hace un cambio, este se guarda al inicio de la lista para que el acceso al último cambio sea inmediato.

El historial puede crecer hasta tener miles de registros.

### Pregunta
¿Qué elegirías?

---

## Escenario 3: Procesamiento de "Big Data" con poca memoria

### Enunciado
Tienes una lista de 10 millones de IDs de usuarios (`Long`).

El servidor donde corre tu programa tiene la memoria RAM muy limitada y necesitas que la estructura ocupe el menor espacio posible.

No harás muchas inserciones, solo lecturas.

### Pregunta
¿Cuál es más eficiente en memoria?

---

## Escenario 4: La aplicación de "Streaming" de música

### Enunciado
Tienes una lista de reproducción de 50 canciones.

El usuario suele escuchar las canciones en orden, pero a veces borra canciones de cualquier parte de la lista (del medio, del inicio, del final) mientras la escucha.

### Pregunta
¿Realmente importa cuál elijas aquí?
