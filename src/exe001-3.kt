//Escrever o código que deve analisar um número inteiro e, caso ele seja par,
//retornar true, caso contrário, retorna false//


package aula02.exe03
fun main(){
    println("${checaNumero(11)}")
}
    fun checaNumero( num1: Int):Boolean {
    return (num1 % 2 == 0)
}
