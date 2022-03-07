fun main() {
    println("Qual o preço?")
    var preco: Double = readLine()!!.toDouble()
    println("Qual a categoria?")
    var categoria: Int = readLine()!!.toInt()
    println("Qual a situação?")
    var situacao: String? = readLine()

    var percentualDeAumento = 0.0

    var percentualDeImposto = 0.0

    if (preco <= 25) {
        if (categoria == 1) {
            percentualDeAumento = 0.05
        } else if (categoria == 2) {
            percentualDeAumento = 0.08
        } else if (categoria == 3) {
            percentualDeAumento = 0.1
        }
    } else if (preco > 25) {
        if (categoria == 1) {
            percentualDeAumento = 0.12
        } else if (categoria == 2) {
            percentualDeAumento = 0.15
        } else if (categoria == 3) {
            percentualDeAumento = 0.18
        }
    }

    if (categoria == 2 || situacao == "R") {
        percentualDeImposto = 0.05
    } else {
        percentualDeImposto = 0.08
    }

    var valorDoAumento = preco * percentualDeAumento
    var valorDoImposto = preco * percentualDeImposto

    var novoPreco = preco + valorDoAumento - valorDoImposto

    var classificao: String = ""

    if (novoPreco <= 50) {
        classificao = "Barato"
    } else if (novoPreco > 50 && novoPreco < 120) {
        classificao = "Normal"
    } else if (novoPreco >= 120) {
        classificao = "Caro"
    }

    print("Valor do aumento: ")
    println("%.2f".format(valorDoAumento))
    print("Valor do imposto: ")
    println("%.2f".format(valorDoImposto))
    print("Novo preço: ")
    println("%.2f".format(novoPreco))
    println("Classificação: $classificao")
}