package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun calculaSalarios() {
    val salarios = bigDecimalArrayOf("1800.50", "1500.00", "10000.00", "1380.00", "5000.00", "5500.00")
    val salariocomaumento: Array<BigDecimal> = salarios.map { salario ->
        calculaAumento(salario)
    }.toTypedArray()

    println("        Salarios      :${salarios.contentToString()}")
    println("  Salarios com Aumento:${salariocomaumento.contentToString()}")


    val gastoInicial = salariocomaumento.soma()

    print("  QUANTOS MESES PRETENDE CALCULAR:")
    val meses = readln().toBigDecimal()

    val gastoTotal = salariocomaumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * (meses - 1.toBigDecimal())).setScale(2)
    }
    val mediaDosUltimos = salariocomaumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    val mediaDosPrimeiros = salariocomaumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println("  Gasto inicial R$:$gastoInicial")
    println("  Gasto total R$:$gastoTotal")
    println("")
    println("  Media dos 3 maiores salarios R$:$mediaDosUltimos")
    println("  Media dos 3 menores salarios R$:$mediaDosPrimeiros")
}


private fun calculaAumento(salarios: BigDecimal): BigDecimal =
    if (salarios < "5000.00".toBigDecimal()) {
        salarios + "500".toBigDecimal()
    } else {
        (salarios * "1.1".toBigDecimal()).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valor: String): Array<BigDecimal> =
    Array<BigDecimal>(valor.size) { i -> valor[i].toBigDecimal() }

fun Array<BigDecimal>.soma(): BigDecimal =
    this.reduce { acumulador, valor -> acumulador + valor }

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.soma() / this.size.toBigDecimal()
    }
}