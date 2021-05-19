/*classes abstrata*/
abstract class Automovel{
    val cor = "Vermelho"
    abstract var nome:String
    abstract fun acelerar()
    abstract fun frear()
    abstract fun monitorEstilizado()
}
class Ferrari: Automovel(){
    override var nome: String = "Ferrari F50"




    override fun acelerar(){
        println("Uma ferrari acelerando")

    }

    override fun frear() {
      println("Uma ferrari freando")
    }
    override fun monitorEstilizado(){

    }
    override fun equals(other: Any?): Boolean {
        val outraFerrari = other as? Ferrari
        return when(other){
            is Ferrari -> {
                this.nome == outraFerrari?.nome
            }
            else -> {
                super.equals(other)
            }
        }
    }


}


