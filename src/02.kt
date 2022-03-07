fun main() {
    println("Quantos reais você tem?")
    var brl: Double = readLine()!!.toDouble()

    var usd = brl/1.8
    var dem = brl/2
    var gbp = brl/3.57

    print("Câmbio em dólar: ")
    println("%.2f".format(usd))
    print("Em marco alemão: ")
    println("%.2f".format(dem))
    print("Em libra esterlina: ")
    println("%.2f".format(gbp))


}
