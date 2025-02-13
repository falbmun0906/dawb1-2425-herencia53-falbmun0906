class Lavadora(var encendido: Boolean): EncendidoApagado {

    override fun encender() {
        encendido = true
    }

    override fun apagar() {
        encendido = false
    }
}