# Principios SOLID en Java 

En este proyecto encontrarás una carpeta por cada principio **SOLID** dentro de `src/`, cada una con su propio ejemplo en Java fácil de entender y su archivo `README.md` explicativo:

1. **[S - Responsabilidad Única (SRP)](src/s_srp/README.md)** (`src/s_srp`)
   - *Ejemplo:* Empleados de un restaurante (Cocinero, Cajero y Personal de Limpieza).
2. **[O - Abierto/Cerrado (OCP)](src/o_ocp/README.md)** (`src/o_ocp`)
   - *Ejemplo:* Calculadora de descuentos (Normal, VIP y Estudiante) sin modificar el código existente.
3. **[L - Sustitución de Liskov (LSP)](src/l_lsp/README.md)** (`src/l_lsp`)
   - *Ejemplo:* Aves voladoras (Águila) vs. aves que no vuelan (Pingüino).
4. **[I - Segregación de Interfaces (ISP)](src/i_isp/README.md)** (`src/i_isp`)
   - *Ejemplo:* Trabajadores Humanos vs. Robots (separando trabajar, comer y dormir).
5. **[D - Inversión de Dependencias (DIP)](src/d_dip/README.md)** (`src/d_dip`)
   - *Ejemplo:* Notificador de mensajes que puede enviar por Email o WhatsApp usando una interfaz común.

## ¿Cómo ejecutar los ejemplos?
Puedes ejecutar todos los ejemplos juntos corriendo [`App.java`](src/App.java), o ejecutar el `main` de cada principio individualmente dentro de su carpeta.
