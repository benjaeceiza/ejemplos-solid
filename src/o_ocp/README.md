# 2. Principio de Abierto/Cerrado (OCP - Open/Closed Principle)

## ¿Qué es este principio?
El **Principio de Abierto/Cerrado** establece que el código debe estar:
- **Abierto para su extensión**: Podemos agregar nuevas funcionalidades fácilmente.
- **Cerrado para su modificación**: No debemos modificar las clases que ya existen y ya funcionan para agregar algo nuevo.

---

## ¿Qué hace este ejemplo y cómo está organizado?
Imagina una tienda que aplica **descuentos** según el tipo de cliente. En lugar de tener una sola clase gigante llena de `if / else`, modularizamos todo en archivos independientes:

- **`Descuento.java`**: Interfaz con el método `aplicar(double precio)`.
- **`SinDescuento.java`**: Devuelve el precio completo.
- **`DescuentoVIP.java`**: Aplica un 20% de descuento.
- **`DescuentoEstudiante.java`**: Aplica un 50% de descuento.
- **`EjemploOCP.java`**: Clase principal con el método `main` para probar todos los descuentos.

### Ventaja
Si mañana queremos agregar un `DescuentoJubilado.java`, simplemente **creamos ese archivo nuevo** implementando `Descuento`, sin tocar ni arriesgarnos a romper `DescuentoVIP.java` ni `SinDescuento.java`.
