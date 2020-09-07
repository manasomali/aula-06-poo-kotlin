package exercicio01

fun main () {
    val cliente1 = Cliente("Matheus","Nascimento")
    val cliente2 = Cliente("Leticia", "dos Santos")

    val conta1 = Conta(1,100.00, cliente1)
    val conta2 = Conta(2,50.00, cliente2)

    conta1.deposito(50.00)
    conta1.saque(200.00)
    conta1.saque(10.00)

    conta2.deposito(20.00)
    conta2.saque(200.00)
    conta2.saque(10.00)
}
