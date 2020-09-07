package exercicio04

class Tripe(var dobrado:Boolean, var alturaMinima: Double, var alturaMaxima:Double, var alturaAtual:Double) {
    fun definirAltura(novaAltura:Double) {
        if((novaAltura>=alturaMinima)&&(novaAltura<=alturaMaxima)) {
            alturaAtual = novaAltura
            println("Altura alterada: $alturaAtual")
        } else {
            println("Altura desejada inviável")
        }
    }
    fun dobrar() {
        dobrado = true
        println("Tripé Dobrado")
    }
    fun desdobrar() {
        dobrado = false
        println("Tripé Desdobrado")
    }
    fun guardar() {
        dobrado = true
        alturaAtual = alturaMinima
        println("Tripé dobrado e recolhido")
    }
    fun prontoParaGuardar() {
        if(dobrado == true && alturaAtual==alturaMinima) {
            println("Tripé pronto para ser guardado")
        } else {
            println("Tripé deve ser dobrado e recolhido para ser guardado")
        }
    }
    fun usar() {
        dobrado = false
        alturaAtual = alturaMaxima/2
        println("Tripé desdobrado e extendido")
    }
    fun prontoParaUsar() {
        if(dobrado == false && alturaAtual==alturaMaxima/2) {
            println("Tripé pronto para ser usado")
        } else {
            println("Tripé deve ser desdobrado e extendido para ser usado")
        }
    }
}