# 1. Principio de Responsabilidad Única (SRP - Single Responsibility Principle)

## ¿Qué es este principio?
El **Principio de Responsabilidad Única** dice que **una clase debe tener una sola razón para cambiar**, es decir, debe encargarse de **una única tarea o responsabilidad**.

Si una clase hace demasiadas cosas distintas (por ejemplo: un solo empleado que cocina, cobra y limpia), cualquier cambio en una de esas tareas puede afectar a las demás.

---

## ¿Qué hace este ejemplo y cómo está organizado?
Imagina un **restaurante** donde separamos cada rol en su propio archivo `.java`:

- **`Cocinero.java`**: Su única responsabilidad es preparar la comida (`cocinar()`).
- **`Cajero.java`**: Su única responsabilidad es cobrar a los clientes (`cobrar()`).
- **`PersonalLimpieza.java`**: Su única responsabilidad es mantener el local limpio (`limpiar()`).
- **`EjemploSRP.java`**: Contiene el método `main` para ejecutar y probar cómo trabajan juntos.

### Ventaja
El código está completamente modularizado: si mañana cambia la forma de cobrar, **solo modificamos `Cajero.java`** sin tocar a `Cocinero.java` ni `PersonalLimpieza.java`.
