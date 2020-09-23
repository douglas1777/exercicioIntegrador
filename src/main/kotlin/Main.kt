package main.kotlin

fun main() {
    val estoque = Estoque()
    estoque.cadastrarLivro(Livro(1))
    estoque.cadastrarLivro(Livro(2))
    estoque.cadastrarLivro(Livro(3))
    estoque.cadastrarLivro(Livro(4))
    estoque.cadastrarLivro(Livro(5))
    estoque.cadastrarColecao(Colecao(codigo=6,livros= mutableListOf(Livro(1),Livro(2),Livro(3))))

    estoque.consultarLivro(5)
    estoque.consultarLivro(6)

    estoque.efetuarVenda(2)
    estoque.efetuarVenda(6)
}