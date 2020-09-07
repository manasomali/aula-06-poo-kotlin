package exercicio05

class Concessionaria {
    var registros = mutableListOf<Venda>()
    fun registrarVenda(veiculo: Veiculo, cliente: Cliente,valor:Double) {
        registros.add(Venda(cliente, veiculo, valor))
        println("")
        println("Todas as vendas:")
        for (registro in registros) {
            println("Carro ${registro.veiculo.modelo} vendido para ${registro.cliente.nome} pelo valor de ${registro.valorDaVenda} reais")
        }
    }
}