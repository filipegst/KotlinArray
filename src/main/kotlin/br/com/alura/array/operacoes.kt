package br.com.alura.array

fun operacoes() {
    val idades = intArrayOf(22, 42, 13, 75, 26)
    val maior = idades.max()
    val menor = idades.min()
    val media = idades.average()
    val maiordeidade = idades.filter { it >= 18 }
    val existemenor = idades.any { it < 18 }
    val todosmaiores = idades.all { it > 18 }

    print("maior:${maior}  menor :${menor}  media:${media} \nexiste menor: ${existemenor}   todos maiores: ${todosmaiores}   lista dos maiores de idade: ${maiordeidade} ")

}