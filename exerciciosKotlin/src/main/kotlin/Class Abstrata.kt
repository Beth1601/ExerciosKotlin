open class Mamifero(val nome: String) {

    fun acordar() {}
    fun dormir() {}

    abstract fun falar()
    abstract fun comer ()

}
class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar(){
        println("au au")

    }
}


fun main() {
val
}
