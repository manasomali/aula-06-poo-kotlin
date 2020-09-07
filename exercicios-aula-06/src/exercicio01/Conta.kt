package exercicio01

class Conta(val numConta:Int, var saldo:Double, val cliente:Cliente) {
    fun deposito(valor:Double) {
        println("")
        println("${cliente.nome}, Operação: Depósito")
        if(valor<0) {
            println("Operação não viável, valor negativo")
            return
        } else {
            saldo += valor
            println("Saldo Atualizado: $saldo")
        }
    }
    fun saque(valor:Double) {
        println("")
        println("${cliente.nome}, Operação: Saque")
        if(valor<0) {
            println("Operação não viável, valor negativo")
            return
        } else if ((saldo-valor)<0) {
            println("Operação não viável, saldo insuficiente")
            return
        } else {
            saldo -= valor
            println("Saldo Atualizado: $saldo")
        }
    }
}