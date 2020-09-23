package main.kotlin

data class Colecao (val preco: Double = 1.0,
                 val codigo: Int,
                 val qtd: Int = 1,
                 val descricao: String = "DDD",
                 val livros: MutableList<Livro>)