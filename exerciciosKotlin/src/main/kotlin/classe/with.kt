package classe


fun main() {
    val p = Pessoa(1985, "Frank")
    p.acordar()
    p.dormir()

    with(p){
        this.acordar()
        this.dormir()
    }

}