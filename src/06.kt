fun main() {
    println("Qual o código do produto?")
    var codigoDoProduto: Int = readLine()!!.toInt()
    println("Quanto foi a quantidade comprada?")
    var quantidadeComprada: Int = readLine()!!.toInt()

    var precoUnitario: Int = 0

    if (codigoDoProduto in 1..10) {
        precoUnitario = 10
    } else if (codigoDoProduto in 11..20) {
        precoUnitario = 15
    } else if (codigoDoProduto in 21..30) {
        precoUnitario = 20
    } else if (codigoDoProduto in 31..40) {
        precoUnitario = 30
    }

    var precoTotal: Int = precoUnitario * quantidadeComprada

    var porcentagemDoDesconto:Double = 0.0

    if (precoTotal < 250){
        porcentagemDoDesconto = 0.05
    } else if (precoTotal in 251..500) {
        porcentagemDoDesconto = 0.1
    } else if (precoTotal > 500) {
        porcentagemDoDesconto = 0.15
    }

    var valorDoDesconto: Double = precoTotal * porcentagemDoDesconto
    var precoFinal: Double = precoTotal - valorDoDesconto

    println("Preço unitário: $precoUnitario")
    println("Preço total da nota: $precoTotal")
    print("Valor do desconto: ")
    println("%.2f".format(valorDoDesconto))
    print("Preço final: ")
    println("%.2f".format(precoFinal))
}