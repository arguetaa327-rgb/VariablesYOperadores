# VariablesYOperadores

## Descripcion del Proyecto

Este proyecto fue desarrollado en Java con el objetivo de practicar el uso de variables, operadores matematicos, operadores logicos y estructuras de control.  

El programa interactua con el usuario por medio de la consola, solicitando datos y mostrando resultados segun las operaciones y validaciones realizadas.

El desarrollo se enfoco en comprender como influyen los tipos de datos en el comportamiento del programa y como las estructuras de control permiten tomar decisiones logicas.

---

# 1. Respuestas Teoricas

## ¿Para que se utilizan los operadores logicos en programacion?

Los operadores logicos se utilizan para evaluar y combinar condiciones dentro de un programa. Permiten tomar decisiones basadas en mas de una comparacion.

Por ejemplo:

- El operador AND (&&) se utiliza cuando es necesario que dos condiciones se cumplan al mismo tiempo.
- El operador OR (||) se utiliza cuando basta con que una de las condiciones sea verdadera.

En este proyecto utilice operadores logicos para realizar comparaciones numericas y para validar el inicio de sesion simulando un sistema de acceso.

Los operadores logicos son fundamentales porque permiten controlar el flujo del programa segun distintas situaciones.

---

## ¿Por que es importante declarar correctamente el tipo de dato de una variable?

Es importante porque el tipo de dato determina que clase de informacion puede almacenar una variable y como se comportara al realizar operaciones.

Por ejemplo:

- int almacena numeros enteros sin decimales.
- double almacena numeros con decimales.
- boolean solo puede almacenar true o false.
- String almacena texto.

Durante el desarrollo observe que cuando se realiza una division entre numeros tipo int, el resultado elimina la parte decimal. Esto demuestra que elegir el tipo de dato correcto influye directamente en los resultados del programa.

Una mala eleccion del tipo de dato puede provocar errores logicos o perdida de informacion.

---

# 2) Justificacion Tecnica de las Estructuras de Control

## Clasificacion de Edad

Para la clasificacion de edad utilice la estructura if-else.  

La razon tecnica es que la clasificacion se basa en rangos de valores numericos (menor que 12, entre 12 y 17, entre 18 y 59, 60 o mas).  

La estructura if-else es mas adecuada cuando se trabajan intervalos o comparaciones por rangos, ya que permite evaluar condiciones progresivas y encadenadas de forma clara y ordenada.

Switch no era la mejor opcion en este caso porque esta mas orientado a evaluar valores exactos y no rangos numericos.

---

## Dia de la Semana

Para el dia de la semana utilice la estructura switch.  

La razon tecnica es que se evalua un valor exacto entre 1 y 7, donde cada numero corresponde directamente a un dia especifico.  

Switch permite organizar mejor el codigo cuando se tienen multiples opciones fijas y claramente definidas, como en un menu de seleccion.

Esto mejora la legibilidad y hace que el codigo sea mas estructurado.

---

## Verificacion de Acceso

Para la verificacion de acceso utilice if-else junto con operadores logicos.

La razon tecnica es que necesitaba evaluar distintos escenarios:

- Usuario y contrasena correctos.
- Usuario correcto pero contrasena incorrecta.
- Usuario no registrado.

Este tipo de validacion requiere combinar condiciones mediante el operador AND (&&) y comparar textos usando el metodo equals().

If-else ofrece mayor flexibilidad para manejar multiples condiciones relacionadas y evaluar casos especificos de forma clara.

---

# Analisis del Comportamiento de la Division entre Enteros

Durante el desarrollo del programa observe que cuando se divide un numero int entre otro numero int, el resultado no incluye decimales.  

Por ejemplo:

5 / 2 devuelve 2 en lugar de 2.5.

Esto ocurre porque el tipo int solo almacena valores enteros, por lo que Java descarta la parte decimal automaticamente.

En cambio, cuando se utilizan tipos como double o float, la division conserva los valores decimales.

Este comportamiento demuestra la importancia de comprender como funciona cada tipo de dato en Java.

---

# Conclusion Personal

Este proyecto me permitio reforzar mis conocimientos sobre tipos de datos, operadores y estructuras de control en Java.  

Comprendi que cada tipo de dato tiene un comportamiento especifico y que elegir correctamente la estructura de control adecuada mejora la claridad y funcionalidad del programa.

Tambien confirme que los operadores logicos son esenciales para construir validaciones y tomar decisiones dentro de cualquier sistema.
