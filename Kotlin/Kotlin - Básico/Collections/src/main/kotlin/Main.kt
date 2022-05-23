//fun main() {

    /*
    Collections - variaveis que armazenaram mais de um valor

    As principais Collections do Kotlin é: Array, List, Set e Map

    Array - armazena mais de um valor e tem tamanho fixo

    Estrutura

    val num = arrayOf("Haskdjla")

     */

    //Exemplo utilizando o Array

    /*
    val num = arrayOf(5, 6, 7, 2, 8)

    println(num[1])

    num[2] = 58

    println(num)
     */

    //For da forma simples para iterar sobre os valores do Array
    /*
    for(i in 0..4){
        println(num[i])
    }
     */

    //Iterar sobre os valores do array utilizando o for each
    /*
    for(i in num){
        println(i)
    }
     */

    //Iterar sobre os valores do array utilizando o for each do kotlin
    /*
    num.forEach {
        println(it)
    }
     */

    /*
    val nomes = arrayOfNulls<String>(3)

    nomes[0] = readln()
     */

    /*
    List - Listagem de valores, tendo um tamanho variável

    List - Lista Imutável - não pode mudar os valores internos e nem alterar o tamanho
    MutableList - Lista Mutável - podemos alterar os valores e o seu tamanho
     */

    //Lista imutável
    /*
    val nomes = listOf("Henrique", "Rodrigo")

    nomes.forEach{
        println(it)
    }
     */

    //Lista mutável
    /*
    val nomes = mutableListOf<String>()

    nomes.add("Henrique")
    nomes.add("Rodrigo")
    nomes.add("Rogério")

    println(nomes)
     */

    //Exemplo prático utilizando o List

    /*
    val nomes = mutableListOf<String>()

    while (true){
        println("Digite alguns nomes para adicionar na lista: ")
        val valor = readln()

        if(valor != ""){
            nomes.add(valor)
        }else{
            break
        }
    }

    println("O tamanho da lista é: ${nomes.size}")
    println(nomes)

    //remove - Exclui um item da lista
    while (true){
        println("Digite um nome para você deletar da lista: ")
        val valor = readln()

        //contains - Verifica se um valor existe na lista
        if(nomes.contains(valor)){
            nomes.remove(valor)
            break
        }else{
            println("O nome $valor não existe na lista")
        }
    }

    println("O tamanho da lista é: ${nomes.size}")
    println(nomes)

    //indexOf - Mostra a posição do item com base em seu valor
    println("Digite agora um valor que você queira editar: ")
    val edit = readln()

    if(nomes.contains(edit)){
        val index = nomes.indexOf(edit)
        println("Digite o novo nome: ")
        val valor = readln()
        nomes[index] = valor
        println("O nome foi atualizado com sucesso!")
    }else{
        println("O nome $edit não existe na lista")
    }

    println("O tamanho da lista é: ${nomes.size}")
    println(nomes)
     */

    /*
    Set - Faz o mesmo que o List, mas ignora valores duplicados

    Set - Imutável
    MutableSet - Mutável
     */

    /*
    val num = mutableSetOf(1, 2, 3, 3, 4, 2)

    println(num.size)

    println(num)
     */

    /*
    Map (ou dicionario) - Através de um par de valores ele consegue armazenar os dados
    O map é construido através de chave e valor

    Pair<K, V>

    Map - Imutável
    MutableMap - Mutável
     */

    /*
    val usuarios = mutableMapOf<Int, String>()

    println("Digite um id pro usuário: ")
    val id = readln().toInt()
    println("Digite o nome do usuário")
    val usu = readln()

    usuarios[id] = usu

    println(usuarios)
     */
/*
fun main(){

    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */

    val produtos = mutableListOf<String>()

    while (true){

        println("Escolha uma opção:\n")
        println("1 - Adicionar Produtos")
        println("2 - Remover Produtos")
        println("3 - Atualizar Produtos")
        println("4 - Listar Produtos")
        println("5 - Sair\n")

        print("Opção: ")
        val opcao = readln().toInt()

        when(opcao){

            1 -> {

                do{
                    println("\nCadastro de Produtos\n")
                    println("Digite o nome do produto:")
                    val prod = readln()

                    if(prod != ""){
                        produtos.add(prod)
                        println("Produto cadastrado!\n")
                    }else{
                        println("O nome do produto não pode ser vazio\n")
                    }
                }while (prod != "")
            }

            2 -> {
                println("Digite o produto a ser deletado:")
                val prod = readln()

                if(produtos.contains(prod)){
                    produtos.remove(prod)
                    println("Produto removido com sucesso!\n")
                }else{
                    println("Produto não existe na lista\n")
                }
            }

            3 -> {

                println("Lista de Produtos\n")

                produtos.forEach {
                    println(it)
                }

                println("\nDigite um produto a ser atualizado: ")
                val prod = readln()

                if(produtos.contains(prod)){
                    val index = produtos.indexOf(prod)

                    println("Digite o novo produto: ")
                    val valor = readln()

                    produtos[index] = valor

                    println("Produto atualizado com sucesso!\n")

                }else{
                    println("Produto não existe na lista\n")
                }

            }

            4 -> {
                println("Lista de Produtos\n")

                produtos.forEach {
                    print("$it, ")
                }

                println()
            }

            5 -> break

            else -> println("Valor Inválido\n")

        }

    }

}
*/
//}