package classe

enum class Prioridade( val value: Int) {
    Baixa(1),
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