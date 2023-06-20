package classe

class Pessoa(val anoNascimento:Int, var nome: String) {
    var olhos : String = ""
    fun dormir() {
    }

    fun acordar(){

    }

}

fun main (){
    var pessoa: Pessoa = Pessoa( 2005, "Fulano")

    pessoa.nome
    pessoa.acordar()


}