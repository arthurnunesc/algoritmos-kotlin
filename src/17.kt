fun main() {
    var nomes = Array<String>(5) { "vazio" }
    var precos = Array<Double>(5) { 0.0 }

    var quantidadeProdutosMenosQue50 = 0

    var nomesEntre50e100 = mutableListOf<String>()

    var quantidadeProdutos100ouMais = 0
    var total100ouMais = 0.0


    for (i in 0..4) {
        var ordinal = i+1
        println("Qual o nome do $ordinal° item?")
        nomes[i] = readLine().toString()

        println("Qual o valor do $ordinal° item?")
        precos[i] = readLine()!!.toDouble()

        if (precos[i] < 50) {
            quantidadeProdutosMenosQue50 += 1
        } else if (precos[i] in 50.0..100.0) {
            nomesEntre50e100.add(nomes[i])
        } else if (precos[i] > 100) {
            total100ouMais += precos[i]
            quantidadeProdutos100ouMais += 1
        }
    }

    var media100ouMais = total100ouMais/quantidadeProdutos100ouMais

    println("Há $quantidadeProdutosMenosQue50 produtos que custam menos de 50 reais.")
    print("Os produtos que custam entre 50 e 100 reais são: ")
    println(nomesEntre50e100)
    println("A média de preço entre os produtos que custam mais de 100 reais é igual a ")
    println("%.2f".format(media100ouMais))
    println(".")
}
