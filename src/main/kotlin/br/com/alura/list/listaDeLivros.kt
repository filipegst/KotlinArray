package br.com.alura.list

fun listaDeLivros() {
    val livro1 = Livro("Larry poxer", "jaykay rouling", 1997, "Parodius")
    val livro2 = Livro("Senhora dos braceletes", "toquinho jr", 1954, "RaperColinhas")
    val livro3 = Livro("Assim escutava zaratrusca", "Nitty", 1820)
    val livro4 = Livro("Esquecidos antecedentes de brazcuba", "escudo de assis", 1800, "Dubrazil")
    val parodias = mutableListOf(livro1, livro2, livro3)
    parodias.add(livro4)
    parodias.sorted().imprime()
    parodias.sortedBy { it.titulo }.imprime()
    parodias.filter { it.editora == "Dubrazil" }.imprime()

}
fun List<Livro>.imprime () {
    val formatacao = this.joinToString (separator = "\n") {
        " - ${it.titulo} De ${it.autor} \n   Data de publicação:${it.anoPublicacao} Editora:${it.editora}\n"
    }
    println("      LISTA DE LIVROS      \n$formatacao")
}