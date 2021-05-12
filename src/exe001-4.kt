//Escrever um programa que imprima na tela os primeiros 100 números
//inteiros positivos ímpares.


package aula02exe04

fun main(){
    first1000dd()
}
fun first1000dd(){
    var number: Int = 1
    var count: Int = 0
    while (count < 5){
        if (number % 2 != 0){
            println("$number")
            count++
        }
        number++
    }

}





