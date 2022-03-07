fun main() {
    var vetor = Array(15) { 0 }

    println("Qual o 1° item do vetor?")
    vetor[0] = readLine()!!.toInt()

    var maiorNumero = vetor[0]
    var posicaoMaiorNumero = 1

    var menorNumero = vetor[0]
    var posicaoMenorNumero = 1

    for (i in 1..14) {
        var ordinal = i+1
        println("Qual o $ordinal° item do vetor?")
        vetor[i] = readLine()!!.toInt()

        if (vetor[i] > maiorNumero) {
            maiorNumero = vetor[i]
            posicaoMaiorNumero = i+1
        } else if (vetor[i] < menorNumero) {
            menorNumero = vetor[i]
            posicaoMenorNumero = i+1
        }

    }

    println("O maior número é o $posicaoMaiorNumero° número do vetor, que é $maiorNumero.")
    println("O menor número é o $posicaoMenorNumero° número do vetor, que é $menorNumero.")
}