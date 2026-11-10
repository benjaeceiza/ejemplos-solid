# 5. Principio de Inversión de Dependencias (DIP - Dependency Inversion Principle)

## ¿Qué es este principio?
El **Principio de Inversión de Dependencias** dice que **las clases principales no deben depender directamente de clases concretas, sino de interfaces (abstracciones)**.

---

## ¿Qué hace este ejemplo y cómo está organizado?
Imagina un sistema de **notificaciones** para avisar a los clientes. En lugar de atar el `Notificador` a un solo medio (como correo electrónico), separamos todo en módulos:

- **`CanalMensaje.java`**: Interfaz común con el método `enviarMensaje(String mensaje)`.
- **`CanalEmail.java`**: Clase que implementa `CanalMensaje` para enviar correos.
- **`CanalWhatsApp.java`**: Clase que implementa `CanalMensaje` para enviar WhatsApps.
- **`Notificador.java`**: Clase principal que recibe cualquier `CanalMensaje` por su constructor y lo usa sin importarle cuál es.
- **`EjemploDIP.java`**: Contiene el método `main` para probar cómo `Notificador` funciona tanto con Email como con WhatsApp.

### Ventaja
Podemos cambiar de Email a WhatsApp (o crear mañana un `CanalSMS.java`) sin tener que modificar una sola línea dentro de `Notificador.java`.
