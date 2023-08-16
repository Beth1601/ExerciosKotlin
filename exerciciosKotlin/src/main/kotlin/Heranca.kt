private class x private constructor()
open class Eletronico(var marca: String) {
    private val s: String = ""
    private fun ativarCorrente() {}
    fun ligar() {}
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {

    fun instalarSoftware() {}
    fun processar() {}
}

fun main() {
    var c: Computador = Computador("Dell")


    c.ligar()
    c.desligar()
    c.marca


}