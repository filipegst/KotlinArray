package br.com.alura.list
import br.com.alura.list.listaDeLivros
import br.com.alura.list.Prateleira
fun main() {
    val parodiasLiterarias = Prateleira ("Parodias", parodias)
    parodiasLiterarias.organizaPorAutor().imprime()
    parodiasLiterarias.organizaPorAno().imprime()
    parodiasLiterarias.organizaPorEditora().imprime()
}
