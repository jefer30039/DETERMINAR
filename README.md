# DETERMINAR

Autor: Jeferson Marín C24549

Asignatura: Álgebra Lineal para Computación (MA-0292)



![](https://github.com/jefer30039/DETERMINAR/blob/main/resources/Screenshot.png)
# Descripción del Problema

## Estructura del Juego

### Número de jugadores y rondas:

- El juego se diseña para tres jugadores.

- Se juega a lo largo de cinco rondas.

- Sistema de ecuaciones y matriz inicial:

- En cada ronda, los jugadores trabajan con una matriz asociada a un sistema de ecuaciones lineales.

- El sistema se selecciona aleatoriamente entre tres opciones.

### Turnos y acciones:

- Cada jugador, en su turno, tiene la oportunidad de cambiar un valor de la matriz.

- Los cambios tienen consecuencias según el determinante de la matriz resultante:

- Si el determinante no cambia o se repite, el jugador pierde su próximo turno.

- Si el determinante vuelve al valor original de la matriz inicial, el jugador puede repetir el turno.

- Cada jugador acumula puntos basados en el valor del determinante tras su cambio:

- Si el determinante es positivo, el puntaje se incrementa por el valor absoluto de la diferencia entre el nuevo determinante y el original.

- Si el determinante es negativo, se suma directamente al puntaje del jugador (puede generar penalización si el determinante es negativo y grande).

### Condiciones de Victoria

#### Victoria por determinante:

El primer jugador en alcanzar un determinante igual a 21 gana inmediatamente, independientemente del puntaje.

#### Victoria por puntaje final:

- Si nadie logra un determinante de 21, al final de las rondas, el jugador con el puntaje total más alto es el ganador.

- En caso de que todos los jugadores terminen con puntajes negativos, el que tenga el puntaje más bajo pierde.

## Ejecución

### Requisitos

- Se requiere tener instalado el JDK.

- No se necesita ninguna biblioteca adicional.

- El programa se puede ejecutar desde la terminal con los siguientes comandos:
```
  javac Main.java
  java Main
```
