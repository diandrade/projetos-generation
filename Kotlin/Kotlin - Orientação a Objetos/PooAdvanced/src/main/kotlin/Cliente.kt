import classes.Cliente
import objetos.Lista

fun main() {

    val cliente = Cliente(
        "",
        "",
        "",
        0.0,
        0
    )

    cliente.dados()

    try {
        while (true) {
            println("***Painel de Ações***\n")

            println("1 - Adicionar Compra")
            println("2 - Remover Compra")
            println("3 - Listar Compra")
            println("4 - Cadastro")
            println("5 - Sair\n")

            println("Insira a ação desejada: ")
            when (readln().toInt()) {
                1 -> Lista.addProduto()
                2 -> Lista.exluirProduto()
                3 -> Lista.listarProdutos()
                4 -> cliente.infoCliente()
                5 -> break
            }

        }
    } catch (e: Exception) {
        println("Você precisa inserir algum parâmetro válido!")
    }


}
