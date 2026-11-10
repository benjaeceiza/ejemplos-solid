# 3. Principio de Sustitución de Liskov (LSP - Liskov Substitution Principle)

## ¿Qué es este principio?
El **Principio de Sustitución de Liskov** dice que **las clases hijas (subclases) deben poder usarse en lugar de sus clases padres sin que el programa falle o se comporte de forma inesperada**.

Si ponemos `volar()` dentro de `Ave`, cuando creemos un `Pinguino` (que es un ave pero no vuela), el programa daría error al intentar hacerlo volar.

---

## ¿Qué hace este ejemplo y cómo está organizado?
Separamos las clases en archivos individuales según lo que realmente pueden hacer:

- **`Ave.java`**: Clase padre con el método `comer()`, que aplica a **todas** las aves sin excepción.
- **`AveVoladora.java`**: Hereda de `Ave` y agrega el método `volar()`.
- **`Aguila.java`**: Hereda de `AveVoladora` (come y vuela).
- **`Pinguino.java`**: Hereda directamente de `Ave` (come y nada, sin métodos falsos para volar).
- **`EjemploLSP.java`**: Contiene el método `main` para ejecutar y comprobar cómo ambas aves funcionan sin errores.

### Ventaja
Podemos usar tanto `Aguila` como `Pinguino` donde sea que el programa espere un objeto `Ave` sin temor a que algo falle.
