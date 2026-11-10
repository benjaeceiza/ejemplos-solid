# 4. Principio de Segregación de Interfaces (ISP - Interface Segregation Principle)

## ¿Qué es este principio?
El **Principio de Segregación de Interfaces** dice que **ninguna clase debería estar obligada a implementar métodos que no utiliza**.

Es mucho mejor tener **varias interfaces pequeñas y específicas** en archivos separados que una sola interfaz gigante.

---

## ¿Qué hace este ejemplo y cómo está organizado?
Imagina una fábrica donde trabajan **Humanos** y **Robots**. Separamos cada capacidad en su propia interfaz y cada trabajador en su propia clase:

- **`Trabajable.java`**: Interfaz con el método `trabajar()`.
- **`Alimentable.java`**: Interfaz con el método `comer()`.
- **`Descansable.java`**: Interfaz con el método `dormir()`.
- **`Humano.java`**: Implementa las tres interfaces (`Trabajable`, `Alimentable` y `Descansable`).
- **`Robot.java`**: Implementa únicamente `Trabajable` (porque un robot no come ni duerme).
- **`EjemploISP.java`**: Contiene el método `main` para ejecutar el ejemplo.

### Ventaja
La clase `Robot` no tiene métodos vacíos o inútiles como `comer()` o `dormir()`, manteniendo cada archivo limpio y enfocado.
