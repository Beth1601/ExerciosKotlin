package classe

class Animal(var especie: String) {
    var fala: String = ""

    init {

        if (especie == "cachorro") {
            fala = "au"
        } else if (especie == "gato") {
            fala = "miau"
        } else {
            ""
        }
        fun falar() {
            println(fala)
        }


    }

}

fun main() {

    Animal ("cachorro").fala

}