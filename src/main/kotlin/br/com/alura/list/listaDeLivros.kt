package br.com.alura.list


fun listaDeLivros() {

    parodias.sorted().imprime()
    parodias.sortedBy { it.titulo }.imprime()
    parodias.filter { it.editora == "Dubrazil" }.imprime()

//    parodias.groupBy { it.editora ?: "Editora desconhecida"  }
//        .forEach {(editora,parodias) ->
//            println("${editora}: ${parodias.joinToString { it.titulo }}")
//
//    }
}

fun List<Livro?>.imprime() {
    val formatacao = this.filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} De ${it.autor} \n   Data de publicação:${it.anoPublicacao} Editora:${it.editora}\n"
        }
    println("      LISTA DE LIVROS      \n$formatacao")
}

fun listaComNulos() {

    val livro1 = Livro("Larry poxer", "Jaykay rouling", 1997, "Parodius")
    null
    val livro2 = Livro("Senhora dos braceletes", "Toquinho jr", 1954, "RaperColinhas")
    val livro3 = Livro("Assim escutava zaratrusca", "Nitty", 1820, null)
    null
    val livro4 = Livro("Esquecidos antecedentes de brazcuba", "Escudo de assis", 1800, "Dubrazil")
    val livro5 = Livro("Prepucio", "Estaphanye Asteca", 2002)
    null
    val livrosNulos: MutableList<Livro?> = mutableListOf(null, livro1, null, livro2, livro3, null, livro4, livro5)

    livrosNulos.imprime()

}

    val parodias: MutableList<Livro> = mutableListOf(
        Livro("Larry poxer", "Jaykay rouling", 1997, "Parodius"),
        Livro("Senhora dos braceletes", "Toquinho jr", 1954, "RaperColinhas"),
        Livro("Assim escutava zaratrusca", "Nitty", 1820),
        Livro("Esquecidos antecedentes de brazcuba", "Escudo de assis", 1800, "Dubrazil"),
        Livro("Prepucio", "Estaphanye Asteca", 2002)
    )
