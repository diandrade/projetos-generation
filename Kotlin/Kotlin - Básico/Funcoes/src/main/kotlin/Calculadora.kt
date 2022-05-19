fun main (){

    println("Escolha a operação desejada: \n" +
            "1 - Soma\n" +
            "2 - Subtração\n" +
            "3 - Divisão\n" +
            "4 - Multiplicação\n")
    val escolha = readln().toInt()

    println("Insira o 1º valor: ")
    var num1 = readln().toInt()

    println("Insira o 2º valor: ")
    var num2 = readln().toInt()


    fun soma(num1: Int, num2: Int): Int {
        val resultSoma = num1 + num2
        return resultSoma
    }
    fun sub(num1: Int, num2: Int): Int {
        val resultSub = num1 - num2
        return resultSub
    }
    fun div(num1: Int, num2: Int): Int {
        val resultDiv = num1 / num2
        return resultDiv
    }
    fun multi(num1: Int, num2: Int): Int {
        val resultMulti = num1 * num2
        return resultMulti
    }

    when(escolha){

        1 -> println("Sua escolha foi soma e a soma de $num1 e $num2 é: ${soma(num1, num2)}")
        2 -> println("Sua escolha foi subtração e a subtração de $num1 e $num2 é: ${sub(num1, num2)}")
        3 -> println("Sua escolha foi divisão e a divisão de $num1 e $num2 é: ${div(num1, num2)}")
        4 -> println("Sua escolha foi multiplicação e a multiplicação de $num1 e $num2 é: ${multi(num1, num2)}")

    }


}


