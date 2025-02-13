class Coche(override var kmHora: Int = 0, override var motorEncendido: Boolean = false): EncendidoApagado, Vehiculo {

    override fun encender() {
        motorEncendido = true
    }

    override fun apagar() {
        motorEncendido = false
    }

    override fun acelerar(cantidad: Int) {
        kmHora += cantidad
    }

    override fun frenar(cantidad: Int) {
        kmHora -= cantidad
    }

}

