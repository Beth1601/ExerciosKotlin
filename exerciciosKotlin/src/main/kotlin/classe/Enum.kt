package classe

enum class Prioridade( val value: Int) {
    Baixa(1){
        override fun toString(): String {
            return "Proridade baixa : $value"
        }
    },
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}


fun main() {
    for (p in Prioridade.values()) {
        println(p)
    }

}