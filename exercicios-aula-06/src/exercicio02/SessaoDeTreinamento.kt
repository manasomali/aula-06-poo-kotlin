package exercicio02

class SessaoDeTreinamento(val experiencia:Int) {
    fun treinaA(jogador:JogadorDeFutebol) {
        println("Jogador ${jogador.nome}: TreinoA")
        println("Experiencia antiga: ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += experiencia
        println("Experiencia nova: ${jogador.experiencia}")
    }
}