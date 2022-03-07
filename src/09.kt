fun main() {
    while (true) {
        var contador = 1
        println("Qual a idade da pessoa de número $contador?")
        var idade = readLine()!!.toInt()
        println("Qual a altura da pessoa de número $contador ?")
        var altura = readLine()!!.toInt()

        var totalDasAlturasDePessoasComMaisDe50 = 0
        var contadorDePessoasComMaisDe50 = 0

        contador += 1

        if (idade > 50) {
            totalDasAlturasDePessoasComMaisDe50 += altura
            contadorDePessoasComMaisDe50 += 1
        }

        if (idade <= 0) {
            var mediaDasAlturasDePessoasComMaisDe50 = totalDasAlturasDePessoasComMaisDe50/contadorDePessoasComMaisDe50
            println("Média das alturas das pessoas com mais de 50 anos: $mediaDasAlturasDePessoasComMaisDe50")
            break
        }
    }
}