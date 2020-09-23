package main.kotlin

data class Livro(val codigo: Int,
                 val preco: Double = 1.0,
                 val qtd: Int = 1,
                 val titulo: String = "a",
                 val autor: String = "b",
                 val lancamento: Int = 2020)
