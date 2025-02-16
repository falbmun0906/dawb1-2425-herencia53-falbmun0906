class Coche(override var kmHora: Int = 0, override var motorEncendido: Boolean = false): EncendidoApagado, Vehiculo {

    override fun encender() {
        motorEncendido = true
    }

    override fun apagar() {
        motorEncendido = false
    }

    override fun acelerar(cantidad: Int) {
        if (motorEncendido) {
            kmHora += cantidad
        } else println("ERROR: El coche está apagado.")
    }

    override fun frenar(cantidad: Int) {
        if (motorEncendido) {
            if (cantidad > kmHora) {
                kmHora = 0
            } else kmHora -= cantidad
        } else println("ERROR: El coche está apagado.")
    }

}

