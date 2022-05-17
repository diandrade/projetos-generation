fun main() {

    /*

    Operadores Relacionais:

    == - Igualdade entre valores
    != - Diferença
    > - Maior
    < - Menor
    >= - Maior ou igual
    <= - Menor ou igual

    Operadores Lógicos

    e ou

    && ||

    Tabela Verdade

    &&
    VV - V
    FV - F
    VF - F
    FF - F

    ||
    VV - V
    FV - V
    VF - V
    FF - F

    if...else

    if(condicao){

        Bloco que será executado, caso a condiçãoi seja verdadeira

    }else if(condicao){

        Bloco que será executado, caso a condição anterior seja falsa
        e ele condizer com a outra condição que foi especificada

    }else{

        Bloco que será executado, caso a condição seja falsa

    }

     */

    //Exemplo prático if...else com texto
    /*
    println("O seu nome é Henrique?")
    print("Resposta: ")
    val opa = readln()

    if(opa == "Sim" || opa == "sim"){

        println("Beleza mano, vlw")

    }else{

        println("Ah, ok")

    }
     */

    //Exemplo fazendo uma simulação de criação de senha
    /*
    print("Crie a sua senha: ")
    val senha = readln()

    println(senha.length)

    if(senha.length < 8){

        println("Senha inválida")

    }else{

        println("Senha criada com sucesso!")

    }
     */


    /*

    Compras menores do que 50 - 0%
    Compras entre 50 e 100 - 10%
    Compras entre 101 e 200 - 20%
    Compras acima de 200 - 30%

    Mostrar o valor da compra do usuário já com o desconto aplicado

     */

    /*
    println("Informe o valor da compra:")
    print("R$")
    val compra = readln().toDouble()

    var desc = 0.0

    /*
    Ranges no Kotlin

    valor..valor - Intervalo de um valor a outro

    1..10 - Intervalo de 1 até 10

     */

    if(compra < 50){

        desc = 0.0

    }else if(compra in 50.0..101.0){

        desc = 0.1

    }else if(compra in 101.0..200.0){

        desc = 0.2

    }else{

        desc = 0.3

    }

    val compraDesc = compra * desc

    println("A sua compra, com ${desc * 100}% de desconto, fica em torno de" +
            " R$${compra - compraDesc}")
     */

    /*
    when - Quando um valor for tal a gente executa uma ação

    when(variavel){

        Estrutura dos códigos que serão executados a partir do momento
        que o variável se encontrar em um valor específico

    }
     */

    //Exemplo prático do uso do when

    print("Digite um valor entre 1 e 12 para descobrir se o mês é frio: ")
    val mes = readln().toInt()
    /*
    when(mes){

        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Valor inválido")

    }
     */

    when(mes){

        in 1..3 -> {
            println("Mês quente")
            println("Melhores meses de todos!")

        }
        in 4..6 -> println("Mês mais ou menos...")
        in 7..9 -> println("Mês FRIO")
        in 10..12 -> println("Mês dahora")

        else -> println("Mês inválido")

    }





}