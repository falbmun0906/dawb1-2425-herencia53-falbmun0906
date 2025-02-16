class Lavadora(var encendido: Boolean = false): EncendidoApagado {

    override fun encender() {
        encendido = true
    }

    override fun apagar() {
        encendido = false
    }
}