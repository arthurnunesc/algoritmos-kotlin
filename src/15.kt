fun main() {
    var vetorInteiro = Array(10) { 0 }

    var vetorSemNulosNemNegativos = mutableListOf<Int>()

    for (i in vetorInteiro.indices) {
        var ordinal = i+1
        println("Qual o $ordinal° item do vetor?")
        vetorInteiro[i] = readLine()!!.toInt()

        if (vetorInteiro[i] > 0) {
            vetorSemNulosNemNegativos.add(vetorInteiro[i])
        }
    }

    println("Vetor A, com nulos e negativos: ")
    println(vetorInteiro.contentToString())
    println("Vetor B, sem nulos nem negativos: ")
    println(vetorSemNulosNemNegativos)
}