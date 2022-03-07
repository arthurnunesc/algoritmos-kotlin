fun main() {
    var estado = true

    while (estado) {
        println("Menu de opções")
        println("1 - Novo salário")
        println("2 - Férias")
        println("3 - Décimo terceiro")
        println("4 - Sair")
        println("Digite a opção desejada")
        var opcao: Int = readLine()!!.toInt()

        when (opcao) {
            1 -> calcularNovoSalario()
            2 -> calcularValorDasFerias()
            3 -> calcularDecimoTerceiro()
            4 -> estado = false
        }
    }

}

fun calcularNovoSalario(): Double {
    println("Qual o salário do funcionário?")
    var salario = readLine()!!.toDouble()

    var salarioNovo = 0.0

    if (salario < 210) {
        salarioNovo = salario * 1.15
    } else if (salario in 210.0..600.0) {
        salarioNovo = salario * 1.1
    } else if (salario > 600) {
        salarioNovo = salario * 1.05
    }

    print("Salário novo: ")
    println("%.2f".format(salarioNovo))

    return salarioNovo
}

fun calcularValorDasFerias(): Double {
    println("Qual o salário do funcionário?")
    var salario = readLine()!!.toDouble()

    var valorDasFerias = salario + (salario * 1/3)

    print("Valor das férias: ")
    println("%.2f".format(valorDasFerias))

    return valorDasFerias
}

fun calcularDecimoTerceiro(): Double {
    println("Qual o salário do funcionário?")
    var salario = readLine()!!.toDouble()

    println("Quantos meses o funcionário trabalhou?")
    var mesesTrabalhados = readLine()!!.toInt()

    while (mesesTrabalhados < 0 || mesesTrabalhados > 12) {
        println("Quantidade de meses inválida, insira novamente")
        mesesTrabalhados = readLine()!!.toInt()
    }

    var valorDoDecimoTerceiro = salario * mesesTrabalhados / 12

    print("Valor do décimo terceiro:")
    println("%.2f".format(valorDoDecimoTerceiro))

    return valorDoDecimoTerceiro
}
