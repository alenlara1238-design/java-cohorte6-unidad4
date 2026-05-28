# 1. Predicate (El Filtro / El Guardia)

**Uso mental:** Filtrar, decidir, evaluar.

**Analogía:** El guardia de una discoteca que te pide el documento de identidad. Mira a una persona (recibe dato) y decide si pasa o no (retorna `boolean`).

## Ejemplo de código

```java
// Evalúa si un número es par
Predicate<Integer> esPar = n -> n % 2 == 0;

// Uso:
boolean resultado = esPar.test(8); // Retorna true
```

## Otro ejemplo rápido

```java
// Evalúa si un texto no está vacío
Predicate<String> tieneContenido = texto -> !texto.isEmpty();

boolean pasar = tieneContenido.test(""); // Retorna false
```

---

# 2. Function<T, R> (El Transformador / La Máquina)

**Uso mental:** Transformar, convertir, mapear.

**Analogía:** Una máquina exprimidora. Le metes una naranja (recibe un dato `T`) y te devuelve algo completamente distinto: jugo de naranja (retorna otro dato `R`).

## Ejemplo de código

```java
// Recibe un String y lo transforma en un Integer (su longitud)
Function<String, Integer> contarLetras = texto -> texto.length();

// Uso:
Integer longitud = contarLetras.apply("Java"); // Retorna 4
```

## Otro ejemplo rápido

```java
// Recibe un precio en dólares (Double) y lo transforma a un texto con el formato (String)
Function<Double, String> formatearPrecio = precio -> "$" + precio + " USD";

String precioTexto = formatearPrecio.apply(19.99); // Retorna "$19.99 USD"
```

---

# 3. Consumer (El Consumidor / El Destino Final)

**Uso mental:** Consumir, procesar, mostrar, guardar.

**Analogía:** Una persona hambrienta comiendo pizza. Le das la pizza (recibe dato), se la come y desaparece, no te devuelve nada (retorna `void` / nada). El dato muere aquí o se envía a otro lado (pantalla, base de datos).

## Ejemplo de código

```java
// Recibe un mensaje y lo imprime en la consola
Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje: " + mensaje);

// Uso:
imprimirMensaje.accept("¡Hola, mundo!"); // Imprime en consola, no genera ninguna variable
```

## Otro ejemplo rápido

```java
// Recibe un usuario y lo guarda en una base de datos ficticia
Consumer<Usuario> guardarEnBD = usuario -> baseDeDatos.save(usuario);
```

---

# 4. Supplier (El Generador / El Grifo)

**Uso mental:** Generar, proveer, fabricar.

**Analogía:** Un pozo de agua o un grifo. No le das nada (recibe nada), pero cuando lo abres, te da agua limpia (retorna un dato). Puedes llamarlo mil veces y siempre te dará algo nuevo.

## Ejemplo de código

```java
// No recibe nada y genera un número aleatorio entre 0 y 100
Supplier<Double> generarNumeroAleatorio = () -> Math.random() * 100;

// Uso:
Double numero = generarNumeroAleatorio.get(); // Retorna, por ejemplo, 42.5
```

## Otro ejemplo rápido

```java
// Genera una nueva lista vacía cada vez que se le pide
Supplier<List<String>> creadorDeListas = () -> new ArrayList<>();

List<String> miListaNueva = creadorDeListas.get();


```