package main.kotlin

data class Colecao (val preco: Double,
                 val codigo: Int,
                 val qtd: Int,
                 val descricao: String,
                 val livros: MutableList<Livro>)