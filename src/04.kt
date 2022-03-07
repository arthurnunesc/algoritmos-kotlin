fun main() {
    println("Valor de horas?")
    var horas: Int = readLine()!!.toInt()
    println("Valor de minutos?")
    var minutos: Int = readLine()!!.toInt()

    var totalDeHorasEmMinutos = horas * 60
    var totalDeMinutos = totalDeHorasEmMinutos + minutos
    var totalDeSegundos = totalDeMinutos * 60

    println("Apenas horas convertidas em minutos: $totalDeHorasEmMinutos")
    println("Total de minutos: $totalDeMinutos")
    println("Total de segundos: $totalDeSegundos")
}