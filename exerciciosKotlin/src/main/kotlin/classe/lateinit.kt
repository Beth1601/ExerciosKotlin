package classe


class Receita (){

   lateinit var instrucoes: String

   fun geraReceita(){
       instrucoes = "Lave as mãos"
   }

    fun imprimeReceita(){
        if (instrucoes.length == 0){
            
        }
    }
}

fun main (){
var r : Receita = Receita ()
    r.geraReceita()

}