fun main() {
    var vetorComNulos = Array(10) { 0 }

    var vetorSemNulos =     mutableListOf<Int>()

    for (i in vetorComNulos.indices) {
        var ordinal = i+1
        println("Qual o $ordinal° item do vetor?")
        vetorComNulos[i] = readLine()!!.toInt()

        if (vetorComNulos[i] == 0) {
            vetorSemNulos.add(1)
        } else {
            vetorSemNulos.add(vetorComNulos[i])
        }
    }

    println("Vetor com nulos: ")
    println(vetorComNulos.contentToString())
    println("Vetor sem nulos: ")
    println(vetorSemNulos)
}