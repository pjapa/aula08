/*Escrever um código que deve analisar quatro números inteiros e, caso numA
seja maior que numC e numD ou caso numB seja maior que numC e numD,
retornar true, caso contrário, retornar false.*/

package aula02exe05

fun main(){
    println("${checarNumero(1, 20, 30, 4)}")
}
fun checarNumero(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
    return ((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD))
}