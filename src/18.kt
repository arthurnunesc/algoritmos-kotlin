fun main() {
    var matriz = Array(5) { Array(5) {0} }

    var matrizMultiplicada = Array(5) { Array(5) {0} }

    for (i in 0..4) {
        for (j in 0..4) {
            var linha = i+1
            var coluna = j+1
            println("Informe o elemento da linha $linha, na coluna $coluna:")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    for (i in 0..4) {
        for (j in 0..4) {
            matrizMultiplicada[i][j] = matriz[i][j]*matriz[i][i]
        }
    }
    
    println("Matriz não-modificada:")
    for (i in 0..4) {
        println(matriz[i].contentToString())
    }

    println("Matriz modificada:")
    for (i in 0..4) {
        println(matrizMultiplicada[i].contentToString())
    }
}