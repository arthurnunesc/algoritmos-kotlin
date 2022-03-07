fun main() {
    println("Idade da pessoa?")
    var idade: Int = readLine()!!.toInt()
    println("Peso da pessoa?")
    var peso: Double = readLine()!!.toDouble()

    if (idade < 20) {
        if (peso <= 60) {
            println("Grupo 9")
        } else if (peso > 60 && peso <= 90) {
            println("Grupo 8")
        } else if ( peso > 90) {
            println("Grupo 7")
        }
    } else if (idade in 21..50) {
        if (peso <= 60) {
            println("Grupo 6")
        } else if (peso > 60 && peso <= 90) {
            println("Grupo 5")
        } else if ( peso > 90) {
            println("Grupo 4")
        }
    } else if (idade > 50) {
        if (peso <= 60) {
            println("Grupo 3")
        } else if (peso > 60 && peso <= 90) {
            println("Grupo 2")
        } else if ( peso > 90) {
            println("Grupo 1")
        }
    } else {
        println("Nenhum grupo")
    }
}