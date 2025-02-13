# Ejercicio 3: Sistema de Dispositivos Electrónicos

Crea tres interfaces:

1. **`EncendidoApagado`** con métodos como `encender()` y `apagar()`.
2. **`DispositivoElectronico`** con un método llamado `reiniciar()`.
3. **`Vehiculo`** con dos propiedades: `motorEncendido` y `kmHora`; y los métodos `acelerar(Int)` y `frenar(Int)`.

Implementa estas interfaces en varias clases como `Telefono`, `Lavadora` y `Coche`. Cada clase debería tener su propia implementación de los métodos de las interfaces que tengan sentido que implementen, simulando el comportamiento que le obligan a desarrollar a cada una.

### Reglas específicas para `Coche`:
- Un coche solo puede **acelerar** y **frenar** si tiene el motor encendido.
- Por defecto, un objeto `Coche` estará apagado.
- Si a un coche le mandamos frenar y su valor final fuera negativo, se asignará a `kmHora` el valor `0`.

## Objetivos:

- Practicar la implementación de interfaces y entender cómo fuerzan a las clases a proporcionar implementaciones concretas de los métodos definidos.
- Comprender cómo se puede usar una interfaz para imponer un contrato que varias clases deben seguir.
- Familiarizarse con el concepto de separación de la interfaz y la implementación.