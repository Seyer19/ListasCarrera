# ListasCarrera 
 
Sistema en Java para registrar a los participantes de una carrera de 10 km usando una **lista doblemente enlazada**. Cada corredor se guarda con su nombre, la empresa que representa y el lugar en el que terminó. Los corredores se registran cuando la carrera ya terminó, por eso los tres datos se capturan juntos al momento de agregarlos.
 
## ¿Qué puede hacer el programa?
 
Al ejecutarlo aparece un menú en consola con estas opciones:
 
| Opción | Acción |
|--------|--------|
| 1 | Agregar un corredor (nombre, empresa y lugar) al final de la lista |
| 2 | Mostrar todos los corredores registrados |
| 3 | Buscar un corredor por nombre |
| 4 | Buscar un corredor por empresa |
| 5 | Buscar un corredor por el lugar en que quedó |
| 6 | Borrar toda la lista |
| 7 | Salir |
 
## Estructura del proyecto
 
```
ListasCarrera/
├── Nodo.java       → Guarda los datos de un corredor y los enlaces a sus vecinos
├── Lista.java      → Maneja la lista: agregar, mostrar, limpiar, saber si está vacía
├── Buscador.java   → Búsquedas por nombre, empresa y lugar
└── Main.java       → Menú principal y lectura de datos del usuario
```
 
### `Nodo`
Cada nodo representa a un corredor. Tiene tres datos (`nombre`, `empresa`, `numeroFin`) y dos referencias:
 
- `next`: apunta al nodo que sigue.
- `back`: apunta al nodo anterior.
El constructor pide los tres datos obligatoriamente, así que no puede existir un nodo sin información del corredor.
 
### `Lista`
Guarda dos referencias:
 
- `inicio`: siempre apunta al primer corredor.
- `fin`: siempre apunta al último corredor.
Tener `fin` permite agregar al final sin recorrer toda la lista.
 
### `Buscador`
Recibe la lista en su constructor y la recorre desde `inicio`, avanzando con `getNext()`, hasta encontrar una coincidencia o llegar a `null`.
 
### `Main`
Muestra el menú, lee los datos con `Scanner` y llama a los métodos de `Lista` y `Buscador`.
 
## ¿Cómo se enlazan los nodos?
 
El método `agregar()` de `Lista` tiene dos casos.
 
### Caso 1: la lista está vacía
 
El nuevo corredor es el primero y el último al mismo tiempo, así que `inicio` y `fin` apuntan a él.
 
```
inicio ──► [ Ana ] ◄── fin
   null ◄── back   next ──► null
```
 
### Caso 2: la lista ya tiene corredores
 
Se hacen tres pasos usando `fin`:
 
1. `fin.setNext(nuevo)` → el último actual apunta hacia adelante al nuevo.
2. `nuevo.setBack(fin)` → el nuevo apunta hacia atrás al último actual.
3. `fin = nuevo` → ahora el nuevo es el último.
Antes de agregar a "Luis":
 
```
inicio ──► [ Ana ] ◄── fin
```
 
Después de agregar a "Luis":
 
```
inicio ──► [ Ana ] ⇄ [ Luis ] ◄── fin
```
 
Y si después se agrega a "Sofía":
 
```
inicio ──► [ Ana ] ⇄ [ Luis ] ⇄ [ Sofía ] ◄── fin
 
null ◄─ back                         next ─► null
```
 
La flecha doble `⇄` significa que cada nodo conoce a su siguiente (`next`) y a su anterior (`back`). Por eso es una lista **doblemente** enlazada.
 
### ¿Cómo se recorre?
 
Para mostrar o buscar, se usa una variable auxiliar que empieza en `inicio` y avanza con `getNext()` hasta llegar a `null`:
 
```java
Nodo i = inicio;
while (i != null) {
    // usar i.getNombre(), i.getEmpresa(), i.getNumeroFin()
    i = i.getNext();
}
```
 
### ¿Cómo se limpia?
 
`limpiar()` pone `inicio` y `fin` en `null`. Los nodos quedan sin ninguna referencia que los alcance y el recolector de basura de Java los elimina automáticamente.
 
## Cómo compilar y ejecutar
 
Los archivos pertenecen al paquete `ListasCarrera`, así que deben estar dentro de una carpeta con ese mismo nombre. Desde la carpeta **padre** de `ListasCarrera`:
 
```
javac ListasCarrera/*.java
```
 
```
java ListasCarrera.Main
```
 
## Equipo
 
Proyecto desarrollado en equipo. Repositorio: [Seyer19/ListasCarrera](https://github.com/Seyer19/ListasCarrera)
 
