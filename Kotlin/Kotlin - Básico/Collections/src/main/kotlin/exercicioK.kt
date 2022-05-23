fun main () {
    /*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.*/


    var num: Int
    var estoq = mutableListOf<String>(" ")

    do {
        println(
            "\n\nInsira um numero para fazer uma a ação:" +
                    "\nDigite, 1, para inserir um item" +
                    "\nDigite, 2, para remover item" +
                    "\nDigite, 3, para atualizar o Item" +
                    "\nDigite, 4, para vizualiza a lista" +
                    "\nDigite, 0, para sair"
        )
        num = readln().toInt()

        when (num) {
            0 -> {
                (println("Programa finalizado!"))
            }
            1 -> {
                println("Digite o qual item vc quer adicionar: ")
                var valor = readln()
                estoq.add(valor)

                println("Item adicionado  com sucesso1")

            }


            2 -> {
                while (true) {
                    println("Digite o qual item vc quer remover: ")
                    var valor = readln()

                    if (estoq.contains(valor)) {
                        estoq.remove(valor)
                        break
                    } else {
                        println("O nome $valor não existe mais nessa lista")
                    }
                }
            }


                3 -> {
                    println("Digite o qual item vc quer atualizar : ")
                    var atul = readln()

                    if (estoq.contains(atul)) {
                        val index = estoq.indexOf(atul)
                        println("Digite o novo nome: ")
                        val valor = readln()
                        estoq[index] = valor
                        println("O nome foi atualizado com sucesso!")
                    } else {
                        println("O nome $atul não existe na lista")
                    }
                }

                4 -> {
                    println("O tamanho da lista é: ${estoq.size}")
                    println(estoq)
                }
            }

        } while(num != 0)


    }