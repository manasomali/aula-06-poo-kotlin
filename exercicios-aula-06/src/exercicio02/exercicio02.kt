package exercicio02

fun main () {
    val jogador1 = JogadorDeFutebol("Matheus",10,10,10,10)
    val jogador2 = JogadorDeFutebol("Leticia",10,10,10,10)

    val sessaodetreinamento = SessaoDeTreinamento(1)
    sessaodetreinamento.treinaA(jogador1)
    sessaodetreinamento.treinaA(jogador2)
}