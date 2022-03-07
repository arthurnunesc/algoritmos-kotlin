fun main() {
    println("Quantas horas extras o funcionário trabalhou?")
    var horasExtra: Int = readLine()!!.toInt()
    println("Quantas horas o funcionário faltou?")
    var horasFaltadas: Int = readLine()!!.toInt()

    println("horasExtra: $horasExtra")
    println("horasFaltadas: $horasFaltadas")

    var h: Int = horasExtra - (horasFaltadas * 2/3)

    println("h: $h")

    var premio = 0

    if (h >= 2400) {
        premio = 500
    } else if (h >= 1800 && h < 2400) {
        premio = 400
    } else if (h >= 1200 && h < 1800) {
        premio = 300
    } else if (h >= 600 && h < 1200) {
        premio = 200
    } else if (h < 600) {
        premio = 100
    }

    println("Valor do prêmio: $premio")
}