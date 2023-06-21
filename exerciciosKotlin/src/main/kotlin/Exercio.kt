fun converterAnos(anos: Int){
    println(" $anos, anos equivalem a: ")
    println(" ${anos *12} meses: ")
    println(" ${anos *365} dias: ")
    println(" ${anos *365 *24} horas: ")
    println(" ${anos *365 *24*60} minutos: ")
    println(" ${anos *365 *24*60*60} segundos: ")

}

fun cuboExerc02(a:Int, b: Int) :Int{
    return a*b



}
fun main (){
    (converterAnos(2))
    println(cuboExerc02(10, 2))
}
