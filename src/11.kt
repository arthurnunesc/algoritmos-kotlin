fun main() {
    var numero: Int?

    var maiorNumero = 0

    var menorNumero = 0

    while (true) {
        println("Digite um número")
        numero = readLine()?.toIntOrNull()

        if (numero == null) {
            println("Maior número: $maiorNumero")
            println("Menor número: $menorNumero")
            break
        }

        if (menorNumero == 0) {
            menorNumero = numero
        }
        if (numero <= 0) {
            println("Número inválido")
        } else if (numero > 0) {
            if (numero > maiorNumero) {
                maiorNumero = numero
            } else if (numero < menorNumero) {
                menorNumero = numero
            }
        }
    }

}