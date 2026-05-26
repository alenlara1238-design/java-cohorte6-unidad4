# Banco de Ejercicios: Traduciendo Lógica a Expresiones Lambda

---

# Ejercicio 1

## Enunciado

> "Recibe un texto y devuélvelo en MAYÚSCULAS"

### Solución

```java
texto -> texto.toUpperCase()
```

### Uso industrial

Estandarizar correos o códigos de cupones antes de guardarlos.

---

# Ejercicio 2

## Enunciado

> "Recibe un objeto Usuario y verifica si su edad es mayor o igual a 18"

### Solución

```java
u -> u.getEdad() >= 18
```

### Uso industrial

Filtro de restricciones de edad en pasarelas de registro.

---

# Ejercicio 3

## Enunciado

> "No recibe nada y devuelve el texto 'Conexión Exitosa'"

### Solución

```java
() -> "Conexión Exitosa"
```

### Uso industrial

Proveer un mensaje de estado por defecto en un sistema de logs.

---

# Ejercicio 4

## Enunciado

> "Recibe el precio de un producto y devuélvelo con el 15% de descuento aplicado"

### Solución

```java
precio -> precio * 0.85
```

### Uso industrial

Motores de ofertas y promociones dinámicas en un e-commerce.

---

# Ejercicio 5

## Enunciado

> "Recibe un objeto Empleado y calcula su salario neto restándole un impuesto fijo de 200"

### Solución

```java
emp -> emp.getSalarioBruto() - 200
```

### Uso industrial

Sistemas de procesamiento de nómina.

---

# Ejercicio 6

## Enunciado

> "Recibe una cadena de texto y verifica si está completamente vacía"

### Solución

```java
cadena -> cadena.isEmpty()
```

### Uso industrial

Validaciones rápidas de formularios de entrada de datos.

---

# Ejercicio 7

## Enunciado

> "No recibe parámetros y genera un número decimal aleatorio entre 0.0 y 1.0"

### Solución

```java
() -> Math.random()
```

### Uso industrial

Generación de identificadores temporales o simulaciones.

---

# Ejercicio 8

## Enunciado

> "Recibe una orden de compra y verifica si el estado actual es 'CANCELADA'"

### Solución

```java
orden -> orden.getEstado().equals("CANCELADA")
```

### Uso industrial

Disparador de alertas para el equipo de soporte o inventario.

---

# Ejercicio 9

## Enunciado

> "Recibe un texto de un comentario y lo imprime directamente en la consola del sistema"

### Solución

```java
comentario -> System.out.println(comentario)
```

### Uso industrial

Trazabilidad básica y depuración de flujos de datos.

---

# Ejercicio 10 (Reto - Dos parámetros)

## Enunciado

> "Recibe dos números enteros y devuelve la suma de ambos"

### Solución

```java
(a, b) -> a + b
```

### Uso industrial

Motores de cálculo de impuestos configurables por región.


# Taller Práctico: Modelado de Lógica con Expresiones Lambda

## Instrucciones

Lee atentamente cada requerimiento del sistema y escribe la expresión lambda de una sola línea que resuelva el problema planteado.

Recuerda aplicar las reglas de simplificación.

---

# Módulo: Comercio Electrónico (E-Commerce)

## Ejercicio 1: Filtro de Envío Gratis

### Contexto

En el carrito de compras, necesitamos verificar si un paquete califica para envío gratuito.

### Requerimiento

Recibe un objeto `Carrito` y verifica si el monto total es estrictamente mayor a `99.00`.

### Tu Lambda

```java
____________________________________________________
```

---

## Ejercicio 2: Conversión de Moneda

### Contexto

La plataforma muestra los precios en dólares, pero un cliente de Europa quiere verlos en euros.

### Requerimiento

Recibe el precio en dólares (`Double`) y devuélvelo multiplicado por la tasa de cambio de `0.92`.

### Tu Lambda

```java
____________________________________________________
```

---

## Ejercicio 3: Generador de Números de Pedido

### Contexto

Al confirmar la compra, el sistema debe generar instantáneamente un prefijo de orden aleatorio para la base de datos.

### Requerimiento

No recibe ningún parámetro y devuelve el texto `"ORD-"` concatenado con un número entero aleatorio.

### Tu Lambda

```java
____________________________________________________
```

---

# Módulo: Seguridad y Control de Usuarios

## Ejercicio 4: Validación de Contraseñas Robustas

### Contexto

En el formulario de registro, el sistema valida la seguridad de la contraseña en tiempo real.

### Requerimiento

Recibe una cadena de texto (`String`) con la contraseña y verifica si su longitud (`length()`) es mayor o igual a `8` caracteres.

### Tu Lambda

```java
____________________________________________________
```

---

## Ejercicio 5: Formateo de Perfil de Usuario

### Contexto

En la barra de navegación queremos mostrar el nombre del usuario de forma estandarizada.

### Requerimiento

Recibe un objeto `Usuario` y devuelve su nombre (`getNombre()`) transformado completamente a minúsculas.

### Tu Lambda

```java
____________________________________________________
```

---

## Ejercicio 6: Auditoría de Intentos Fallidos

### Contexto

El sistema detectó un inicio de sesión sospechoso y debe enviarlo al centro de control.

### Requerimiento

Recibe un objeto `LogSeguridad` e imprímelo en la consola de errores del sistema (`System.err.println`).

### Tu Lambda

```java
____________________________________________________
```

---

# Módulo: Recursos Humanos y Analítica

## Ejercicio 7: Filtro de Empleados Activos

### Contexto

El departamento de nómina necesita procesar los pagos del mes, pero solo de las personas que siguen trabajando en la empresa.

### Requerimiento

Recibe un objeto `Empleado` y verifica si su estado de actividad (`isActivo()`) es igual a `true`.

### Tu Lambda

```java
____________________________________________________
```

---

## Ejercicio 8: Cálculo de Bonificación por Rendimiento

### Contexto

Se acerca el fin de año y se calculará un bono extra para los vendedores estrella.

### Requerimiento

Recibe el salario base (`Double`) de un empleado y devuélvelo aumentado en un `25%` (multiplicado por `1.25`).

### Tu Lambda

```java
____________________________________________________
```

---

## Ejercicio 9: Generación de Fechas de Reporte

### Contexto

El sistema de analítica automatizado necesita estampar la hora exacta en la que se solicita un reporte PDF sin que el usuario intervenga.

### Requerimiento

No recibe parámetros y devuelve un objeto de tipo `LocalDateTime` usando su método de fábrica `LocalDateTime.now()`.

### Tu Lambda

```java
____________________________________________________
```

---

## Ejercicio 10 (Reto): Comparador de Versiones de Software

### Contexto

Un sistema DevOps necesita comparar dos servicios para saber cuál tiene la versión más reciente en el servidor.

### Requerimiento

Recibe dos números enteros (`versionA`, `versionB`) y devuelve el número que resulte mayor entre ambos utilizando `Math.max(a, b)`.

### Tu Lambda

```java
____________________________________________________
```

---

# Hoja de Respuestas (Para el Profesor)

## Soluciones

### Ejercicio 1

```java
carrito -> carrito.getTotal() > 99.00
```

### Ejercicio 2

```java
precio -> precio * 0.92
```

### Ejercicio 3

```java
() -> "ORD-" + (int)(Math.random() * 10000)
```

### Ejercicio 4

```java
password -> password.length() >= 8
```

### Ejercicio 5

```java
u -> u.getNombre().toLowerCase()
```

### Ejercicio 6

```java
log -> System.err.println(log)
```

### Ejercicio 7

```java
emp -> emp.isActivo()
```

También es válido:

```java
emp -> emp.isActivo() == true
```

### Ejercicio 8

```java
salario -> salario * 1.25
```

### Ejercicio 9

```java
() -> LocalDateTime.now()
```

### Ejercicio 10

```java
(versionA, versionB) -> Math.max(versionA, versionB)
```


# Taller: Compatibilidad de Firmas y Lambdas

## Instrucciones

Analiza la firma del método provisto en cada ejercicio.  
Presta especial atención a la interfaz funcional que solicita y a los tipos genéricos (`<T, R>`).

Luego, selecciona la única opción de expresión lambda que es técnicamente compatible y no generaría error de compilación.

---

# Ejercicio 1: El Validador de Cupones

## Contexto

El sistema necesita evaluar si un código de descuento ingresado por el usuario aún es vigente.

## Firma del método

```java
public static void aplicarDescuento(
        String codigo,
        Predicate<String> validador)
```

## Opciones de Lambdas

### A)

```java
() -> codigo.equals("PROMO2026")
```

### B)

```java
c -> c.length() == 8
```

### C)

```java
c -> System.out.println(c)
```

### D)

```java
(c1, c2) -> c1.isEmpty()
```

---

# Ejercicio 2: El Conversor de Temperatura

## Contexto

Un módulo de meteorología de la industria agrícola necesita transformar lecturas de sensores.

## Firma del método

```java
public static Double transformarLectura(
        Double fahrenheit,
        Function<Double, Double> formula)
```

## Opciones de Lambdas

### A)

```java
f -> (f - 32) * 5 / 9
```

### B)

```java
() -> 25.5
```

### C)

```java
f -> f > 0
```

### D)

```java
(f) -> {
    System.out.println(f);
}
```

---

# Ejercicio 3: El Generador de Reportes (Fábrica)

## Contexto

Un sistema de analítica empresarial necesita instanciar configuraciones de impresión limpias bajo demanda.

## Firma del método

```java
public static Reporte exportarPDF(
        Supplier<Reporte> creadorDePlantilla)
```

## Opciones de Lambdas

### A)

```java
rep -> new Reporte()
```

### B)

```java
() -> "Reporte_Final.pdf"
```

### C)

```java
() -> new Reporte()
```

### D)

```java
rep -> rep.imprimir()
```

---

# Ejercicio 4: El Despachador de Correos

## Contexto

La aplicación ha terminado de procesar una compra y debe notificar al cliente enviando la información al servicio de mensajería.

## Firma del método

```java
public static void notificarCliente(
        Factura fact,
        Consumer<Factura> servicioEnvio)
```

## Opciones de Lambdas

### A)

```java
fact -> fact.getTotal() > 500
```

### B)

```java
f -> System.out.println(
        "Enviando factura de: " + f.getId())
```

### C)

```java
() -> System.out.println("Email enviado")
```

### D)

```java
f -> new Factura()
```

---

# Ejercicio 5: El Extractor de Datos (Mapeador)

## Contexto

En una aplicación de recursos humanos, queremos extraer únicamente el correo electrónico de un objeto empleado completo.

## Firma del método

```java
public static String extraerContacto(
        Empleado emp,
        Function<Empleado, String> extractor)
```

## Opciones de Lambdas

### A)

```java
e -> e.getEmail()
```

Asumiendo que `getEmail()` retorna un `String`.

### B)

```java
() -> emp.getEmail()
```

### C)

```java
String email -> email.toLowerCase()
```

### D)

```java
e -> e.isActivo()
```

Asumiendo que `isActivo()` retorna un `boolean`.

---

# Hoja de Respuestas y Justificación (Para el Profesor)

---

# Ejercicio 1

## Respuesta correcta

```java
B
```

## Justificación

`Predicate<String>` necesita recibir un `String` (la variable `c`) y retornar obligatoriamente un `boolean`.

```java
c -> c.length() == 8
```

- La opción A falla porque no recibe parámetros.
- La opción C falla porque retorna `void` (es un `Consumer`).
- La opción D falla porque intenta recibir dos parámetros.

---

# Ejercicio 2

## Respuesta correcta

```java
A
```

## Justificación

`Function<Double, Double>` recibe un número y debe retornar otro número modificado.

```java
f -> (f - 32) * 5 / 9
```

- La opción B es un `Supplier`.
- La opción C retorna un `boolean` (es un `Predicate`).
- La opción D no retorna nada (`void`).

---

# Ejercicio 3

## Respuesta correcta

```java
C
```

## Justificación

`Supplier<Reporte>` no recibe absolutamente nada `()` y está obligado a retornar un objeto de tipo `Reporte`.

```java
() -> new Reporte()
```

- La opción A y D intentan recibir un parámetro.
- La opción B retorna un `String` en lugar de un `Reporte`.

---

# Ejercicio 4

## Respuesta correcta

```java
B
```

## Justificación

`Consumer<Factura>` recibe un objeto `Factura` (`f`) y ejecuta una acción que no devuelve nada (`void`).

```java
f -> System.out.println(
        "Enviando factura de: " + f.getId())
```

- La opción A devuelve un `boolean`.
- La opción C no recibe parámetros.
- La opción D devuelve un objeto `Factura`.

---

# Ejercicio 5

## Respuesta correcta

```java
A
```

## Justificación

`Function<Empleado, String>` requiere un objeto `Empleado` como entrada y debe devolver un `String` como salida.

```java
e -> e.getEmail()
```

- La opción B no recibe parámetros.
- La opción C asume que la entrada es un `String`.
- La opción D devuelve un `boolean`.