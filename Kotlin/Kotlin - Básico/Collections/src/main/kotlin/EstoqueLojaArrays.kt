/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo Kotlin do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

val produtos = mutableListOf<String>()

fun main() {
    while (true) {

        println("Insira a ação atual:")
        println("1 - Armazenar Produto")
        println("2 - Remover Produto")
        println("3 - Atualizar produto")
        println("4 - Demonstrar os produtos")
        println("(Outra tecla - Sair)")

        when (readln().toInt()) {
            1 -> addProduto()
            2 -> remProduto()
            3 -> attProduto()
            4 -> verProduto()
            else -> break
        }

    }
}

fun addProduto() {

    while (true) {
        println("Digite alguns produtos para adicionarmos no estoque: \n" +
                "(Aperte Enter para voltar ao menu.)")
        val valor = readln()

        if (valor.isEmpty()) {
            break
        }else{
            produtos.add(valor)
        }

    }
}

fun remProduto() {

    while (true) {
        println("Digite um nome para você deletar da lista: ${(produtos)}")
        val valor = readln()

        if (produtos.contains(valor)) {
            produtos.remove(valor)
            break
        } else {
            println("O nome $valor não existe na lista")
        }
    }
}

fun attProduto() {
    println("Digite agora um valor que você queira editar: ${(produtos)}")
    val edit = readln()
    if (produtos.contains(edit)) {
        val index = produtos.indexOf(edit)
        println("Digite o novo produto: ")
        val valor = readln()
        produtos[index] = valor
        println("O produto foi atualizado com sucesso!")
    } else {
        println("O produto $edit não existe na lista")
    }
}

fun verProduto() {
    println("Sua lista têm ${produtos.size} produtos")
    println("Esses produtos são: ${produtos}")
}


