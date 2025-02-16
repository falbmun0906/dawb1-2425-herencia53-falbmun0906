class Telefono(var encendido: Boolean = false) : DispositivoElectronico, EncendidoApagado {
    override fun reiniciar() {
        if (encendido == true) {
            encendido = false
            encendido = true
            println("Dispositivo reiniciado con éxito.")
        }
    }

    override fun encender() {
        encendido = true
    }

    override fun apagar() {
        encendido = false
    }

}