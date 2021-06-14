/*fun main() {
    val Thiago = Cliente(1234, "Sant'anna", "23123", 2343242) //numero de clinte,nome e sbrenome, num de rg, num cpf
    val contaPoupancaCaixa = ContaPoupanca(cliente = Thiago)
    contaPoupancaCaixa.deposito(20.0)
    contaPoupancaCaixa.recolherJuros()

    val contaCorrentNunBank = ContaCorrente(cliente = Thiago)
    contaCorrentNunBank.sacar()
}

class Cliente(
    numeroCliente: Int,
    sobrenome: String,
    rg: String,
    cpf: Int
)

open class Conta(                    // fazer deposito, sacar dinheiro, consultar saldo
    cliente: Cliente,
) {

    var saldo: Double = 0.0

    fun deposito(valor: Double) {
        saldo += valor
        println("O novo saldo é $saldo")
    }

    open fun sacar() {
        //fazer saque
    }

    fun consultarSaldo() {
        //consultar saldo
    }
}

class ContaPoupanca(   // taxa de juros,
    cliente: Cliente,
    var taxaJuros: Double = 0.0
): Conta(cliente = cliente) {

    fun recolherJuros() {
        val juros = saldo * (taxaJuros / 100)
        saldo += juros
        println("Meu novo saldo é $saldo")
    }
}

class ContaCorrente(
    cliente: Cliente
): Conta(cliente = cliente) {

    fun depositarCheque() {
        //depositar um novo cheque
    }

    override fun sacar() {
        //sacar conta corrente
    }
}*/