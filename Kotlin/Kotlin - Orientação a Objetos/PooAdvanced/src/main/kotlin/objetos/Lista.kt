package objetos

object Lista {

        private val listaDeCompras = mutableListOf<String>()

        fun addProduto(){
            println("Insira o nome do produto: ")
            val produto = readln()

            if(produto != "" && produto.length <= 20){
                listaDeCompras.add(produto)
                println("O produto $produto foi adicionado!")
            }else{
                println("Insira algo aqui!\n")
            }
        }

        fun exluirProduto(){
            println("Insira o produto a ser excluido de seu carrinho!")
            val produto = readln()

            if(listaDeCompras.contains(produto)){
                listaDeCompras.remove(produto)
                println("O produto $produto foi removido com sucesso!")
            }else{
                println("Produto não existe na lista")
            }
        }

        fun listarProdutos(){
            println("Lista de Produtos\n")

            listaDeCompras.forEach {
                print("$it\n")
            }

            println()
        }


}