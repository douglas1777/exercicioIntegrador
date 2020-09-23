package main.kotlin

class Estoque {
    var listaLivro = mutableMapOf<Int, Livro>()
    var listaColecoes = mutableMapOf<Int, Colecao>()

    fun consultarLivro(codigo: Int) {
        if (listaLivro.containsKey(codigo)) {
            println(listaLivro.get(codigo))
            return
        }

        if (listaColecoes.containsKey(codigo)) {
            println(listaColecoes.get(codigo))
            return
        }

        println("Livro ou coleção não encontrado ")
    }

    fun cadastrarLivro(livro: Livro) {
        listaLivro[livro.codigo] = livro
    }

    fun cadastrarColecao(colecao: Colecao) {
        listaColecoes[colecao.codigo] = colecao
    }

    fun efetuarVenda(codigo: Int) {
        if (listaLivro.containsKey(codigo)) {
            if (listaLivro.get(codigo)?.qtd == 0) println("Estoque esgotado.")
            else listaLivro.get(codigo)?.qtd?.minus(1)
            println("Venda do livro ${listaLivro.get(codigo)} concluída.")
            return
        }

        if (listaColecoes.containsKey(codigo)) {
            if (listaColecoes.get(codigo)?.qtd == 0) println("Estoque esgotado.")
            else listaColecoes.get(codigo)?.qtd?.minus(1)
            println("Venda da coleção ${listaColecoes.get(codigo)} concluída.")
            return
        }
    }

}


