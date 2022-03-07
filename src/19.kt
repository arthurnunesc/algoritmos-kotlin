fun main() {
    var matriz = Array(3) { Array(4) {0} }

    var quantidadeDePares = 0

    var somaDosImpares = 0

    var somaTotal = 0

    for (i in 0..2) {
        for (j in 0..3) {
            var linha = i+1
            var coluna = j+1
            println("Informe o elemento da linha $linha, na coluna $coluna:")
            matriz[i][j] = readLine()!!.toInt()

            somaTotal += matriz[i][j]

            if (matriz[i][j] % 2 == 0) {
                quantidadeDePares += 1
            } else if (matriz[i][j] % 2 != 0) {
                somaDosImpares += matriz[i][j]
            }
        }
    }

    for (i in 0..2) {
        println(matriz[i].contentToString())
    }

    var mediaTotal = somaTotal/12


    println("Na matriz há $quantidadeDePares números pares.")
    println("A soma dos números ímpares é igual a $somaDosImpares.")
    println("A média entre todos os números é igual a $mediaTotal.")
}