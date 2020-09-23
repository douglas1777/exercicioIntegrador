package main.kotlin

fun main() {
    val estoque = Estoque()
    estoque.cadastrarLivro(Livro(1))
    estoque.cadastrarLivro(Livro(2))
    estoque.cadastrarLivro(Livro(3))
    estoque.cadastrarLivro(Livro(4))
    estoque.cadastrarLivro(Livro(5))
    estoque.consultarLivro(5)
    estoque.efetuarVenda(2)
}