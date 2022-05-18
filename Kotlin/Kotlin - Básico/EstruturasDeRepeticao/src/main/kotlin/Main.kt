fun main(args: Array<String>) {

    /*
    Estruturas de Repetição

    while - equivalente ao enquanto
    do...while - equivalente ao faca...enquanto
    for - equivalente ao para

    Estrutura do While

    while(condicao){

        Código que vai se repetir enquanto a condição for verdadeira

    }
     */
    /*

    //Exemplo prático while

    var soma = 0.0
    var num = 100.0

    while (num != 0.0){
        print("Digite um número diferente de 0: ")
        num = readln().toDouble()
        soma += num
    }

    println("A soma de todos os números digitados é: $soma")
     */

    /*
    Estrutura do do...while

    do{

        Bloco de código que será executado pelo menos uma vez e se
        repetirá caso a condição seja verdadedeira

    }while(condicao)
     */
    /*

    //Exemplo prático do...while

    var cont = 0

    do{

        println("Tem o Pete e o Repete, o Pete morreu, quem sobrou?")
        val nome = readln()
        cont++

    }while (nome == "Repete" && cont < 3)
     */

    /*
    Estrutura do for

    para(inteiro i = 0; i < 10; i++)

    for(variavel range step){

        codigo que vai loopar enquanto o nosso range não é finalizado

    }
     */

    //Exemplo prático do for

    /*
    print("Digite um número para calcularmos sua tabuada: ")
    val num = readln().toDouble()

    for (i in 10 downTo  1 step 2){
        println("$num x $i = ${num * i}")
    }
     */

}