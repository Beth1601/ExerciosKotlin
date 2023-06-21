package classe



class Pessoa(val anoNascimento:Int, var nome: String) {
    var doc: String? = null


    constructor ( anoNascimento: Int, nome: String, doc: String) : this (1995, nome){
        this.doc = doc

    }

    fun dormir() {
    }

    fun acordar(){

    }

}

fun main (){
    var pessoa: Pessoa = Pessoa( 2005, "Fulano")

    pessoa.nome
    pessoa.acordar()
    pessoa.doc




}