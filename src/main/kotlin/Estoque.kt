package main.kotlin


class Estoque {
    var listaLivro = mutableMapOf<Int, Livro>()
    var listaColecoes = mutableMapOf<Int, Colecao>()

    fun consultarLivro(codigo: Int) {

        if (listaLivro.containsKey(codigo)) println(listaLivro.get(codigo))

        if (listaColecoes.containsKey(codigo)) println(listaColecoes.get(codigo))
        else println("Livro ou coleção não encontrado ")
    }
}

