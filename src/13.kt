fun main() {
    var vetorInteiro = Array(10) { 0 }

    var vetorApenasPositivos = mutableListOf<Int>()

    for (i in vetorInteiro.indices) {
        var ordinal = i+1
        println("Qual o $ordinal° item do vetor?")
        vetorInteiro[i] = readLine()!!.toInt()
        if (vetorInteiro[i] > 0) {
            vetorApenasPositivos.add(vetorInteiro[i])
        }
    }

    println("Vetor apenas com os positivos: ")
    println(vetorApenasPositivos)
}