package br.com.alura.list

data class Prateleira (
    val genero : String,
    val livros: List <Livro>
) {
    fun organizaPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }


    fun organizaPorAno() : List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
    fun organizaPorEditora() : List <Livro> {
        return livros.sortedBy { it.editora }
    }
}