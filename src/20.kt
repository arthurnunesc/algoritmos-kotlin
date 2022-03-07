fun main() {
    var matriz = Array(4) { Array(5) {0} }

    var vetor = mutableListOf<Int>()

    for (i in 0..3) {
        for (j in 0..4) {
            var linha = i+1
            var coluna = j+1
            println("Informe o elemento da linha $linha, na coluna $coluna:")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    var somaDaColuna = 0

    for (j in 0..4) {
        for (i in 0..3) {
            somaDaColuna += matriz[i][j]
        }
        vetor.add(somaDaColuna)
        somaDaColuna = 0
    }

    var vetorSoCom10ouMais = mutableListOf<Int>()


    for (i in vetor.indices) {
        if (vetor[i] > 10) {
            vetorSoCom10ouMais.add(vetor[i])
        }
    }

    if (vetorSoCom10ouMais.isNullOrEmpty()) {
        println("Nenhum dos somatórios das colunas resultou em um número maior que 10.")
    } else {
        println("Vetor com os somatórios que deram mais de 10: $vetorSoCom10ouMais")
    }
}