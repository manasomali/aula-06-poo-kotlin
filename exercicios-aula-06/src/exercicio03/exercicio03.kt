package exercicio03

fun main () {
    var atleta1 = Atleta("Matheus",10,10)
    var atleta2 = Atleta("Leticia", 100,100)

    var prova1 = Prova(1,1)
    var prova2 = Prova(10,50)
    var prova3 = Prova(100,100)

    println("Atleta ${atleta1.Nome}")
    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta1))
    println("")
    println("Atleta ${atleta2.Nome}")
    println(prova1.podeRealizar(atleta2))
    println(prova2.podeRealizar(atleta2))
    println(prova3.podeRealizar(atleta2))

}