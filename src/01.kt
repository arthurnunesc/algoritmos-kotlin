fun main() {
    println("Quantos lados tem o polígono desejado?")
    var n: Int = readLine()!!.toInt()

    val nd = n * (n - 3) / 2

    println("O polígono informado tem $nd diagonais.")
}