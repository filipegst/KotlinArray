package br.com.alura.array

fun MaiorMenoridade() {
    var maiorIdade: Int = Int.MIN_VALUE
    var menorIdade: Int = Int.MAX_VALUE

    val idade = IntArray(5)
    idade[0] = 25
    idade[1] = 42
    idade[2] = 18
    idade[3] = 21
    idade[4] = 32


    for (idades in idade) {
        if (idades > maiorIdade) {
            maiorIdade = idades
        }
        idade.forEach { idade ->
            if (idades < menorIdade) {
                menorIdade = idades
            }
        }
    }
    println(menorIdade)
    println(maiorIdade)
}