package exercicio05

fun main () {
    var carro1 = Veiculo("Tesla","ModeloTesla1",2020,"Preto",0.0)
    var cliente1 = Cliente("Matheus", "Nascimento","matheus@hotmail.com")
    var carro2 = Veiculo("Tesla","ModeloTesla2",2020,"Cinza",0.0)
    var cliente2 = Cliente("Leticia", "dos Santos","leticia@hotmail.com")

    var concessionaria = Concessionaria()

    concessionaria.registrarVenda(carro1,cliente1,1000000.00)
    concessionaria.registrarVenda(carro2,cliente2,1000000.00)
}