package classe

fun main() {
    val f1: Forma = Forma(10, 8)
    val f2: Forma = Forma(10, 8)
    println( f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-----------------------")
    println(f2.toString())
    println(f2.hashCode())

}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Forma) {
            return (other.a == this.a && other.b == this.b)
        } else {
            return false
        }
    }

}


data class FormaData(val a: Int, val b: Int)


