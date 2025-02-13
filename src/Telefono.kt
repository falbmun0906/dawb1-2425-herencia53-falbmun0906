class Telefono(var encendido: Boolean) : DispositivoElectronico, EncendidoApagado {
    override fun reiniciar() {
        if (encendido == true) {
            encendido = false
            encendido = true
        }
    }

    override fun encender() {
        encendido = true
    }

    override fun apagar() {
        encendido = false
    }

}