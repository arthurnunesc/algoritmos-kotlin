fun main() {
    println("Qual o código do cliente?")
    var codigoDoCliente = readLine()!!.toInt()
    println("Qual o tipo do investimento?")
    var tipoDeInvestimento = readLine()!!.toInt()
    println("Quanto foi investido?")
    var valorInvestido = readLine()!!.toDouble()

    var rendimentoMensal = 0.0

    if (tipoDeInvestimento == 1) {
        rendimentoMensal = 0.015
    } else if (tipoDeInvestimento == 2) {
        rendimentoMensal = 0.02
    } else if (tipoDeInvestimento == 3) {
        rendimentoMensal = 0.04
    }

    rendimentoMensal *= 100

    println("Rendimento mensal: $rendimentoMensal por cento ao mês")

    rendimentoMensal /= 100

    var juros = valorInvestido * rendimentoMensal

    println("Total investido: $valorInvestido reais")
    println("Juros a serem pagos mensalmente: $juros reais")

}