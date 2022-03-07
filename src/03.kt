fun main() {
    println("Quantas horas foram trabalhadas?")
    var horasTrabalhadas: Int = readLine()!!.toInt()
    println("Qual o valor do salário mínimo?")
    var salarioMinimo: Double = readLine()!!.toDouble()
    println("Quantas horas extras foram trabalhadas?")
    var horasExtra: Int = readLine()!!.toInt()

    var valorDaHoraTrabalhada = salarioMinimo/8
    var valorDaHoraExtra = salarioMinimo/4
    var salarioBruto = horasTrabalhadas * valorDaHoraTrabalhada
    var quantiaAReceberPorHorasExtra = horasExtra * valorDaHoraExtra
    var salarioAReceber = salarioBruto + quantiaAReceberPorHorasExtra;

    println("horasTrabalhadas: $horasTrabalhadas")
    println("valorDaHoraTrabalhada: $valorDaHoraTrabalhada")

    println("quantiaAReceberPorHorasExtra: $quantiaAReceberPorHorasExtra")
    println("Salário bruto: $salarioBruto")
    println("O salário a receber é de $salarioAReceber reais");
}