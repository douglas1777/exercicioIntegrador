package com.br.kotlin.exerciciointegrador

class Estoque : Livro() {
    var listaLivro= mutableMapOf("Judas" to 1)
    var listaColecoes = mutableMapOf("Jonas Colection" to 1)

    fun consultarLivro(){
        println("Todas Chaves: ${listaLivro.keys}")
        println("Todos valores: ${listaLivro.values}")
        if ("Judas" in listaLivro)
            println("Valor por chave \"Judas\": ${listaLivro["Judas"]}")
        if(1 in listaLivro.values)
            println("O valor 1 está na lista")
        if (listaLivro.containsValue(1))
            println("O valor 1 está  na lista")
    }





}