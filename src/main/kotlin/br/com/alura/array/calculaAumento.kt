package br.com.alura.array

fun calculaAumento() {
    val salario = doubleArrayOf(1200.0, 1700.0, 3000.0, 5000.0, 7000.0)
    for (salarioFuncionario in salario.indices)
        salario[salarioFuncionario] += salario[salarioFuncionario] * 0.1

    salario.forEachIndexed { indx, salarioFuncionario ->
        salario[indx] += salarioFuncionario * 0.1

    }

    println(salario.contentToString())
}
