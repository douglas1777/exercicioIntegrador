package main.kotlin

import java.util.*


class Estoque {

    private val scanner = Scanner(System.`in`)
    var listaLivro = mutableMapOf<Int, Livro>()
    var listaColecoes = mutableMapOf<Int, Colecao>()


    fun consultarLivro(codigo: Int) {

        if (listaLivro.containsKey(codigo)) println(listaLivro.get(codigo))

        if (listaColecoes.containsKey(codigo)) println(listaColecoes.get(codigo))
        else println("Livro ou coleção não encontrado ")
    }

    fun cadastrarLivro(livro: Livro) {
        listaLivro[livro.codigo] = livro
    }
}


