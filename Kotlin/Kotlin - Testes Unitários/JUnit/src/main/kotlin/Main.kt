import objects.Calculadora

fun main() {

    while(true){

        println("****Calculadora Dígital****")
        println()
        println("1 -> Soma")
        println("2 -> Subtração")
        println("3 -> Multiplicação")
        println("4 -> Divisão")
        println("5 -> Potencialização")
        println("6 -> Radicialização")
        println("7 -> Sair")
        println()
        println("Escolha a conta desejada")

        when(readln()){
            "1" -> {
                println("Digite o 1º valor: ")
                val n1 = readln().toInt()
                println("Digite o 2º valor: ")
                val n2 = readln().toInt()
                println("A soma entre $n1 e $n2 é ${Calculadora.soma(n1, n2)}")
            }

            "2" -> {
                println("Digite o 1º valor: ")
                val n1 = readln().toInt()
                println("Digite o 2º valor: ")
                val n2 = readln().toInt()
                println("A subtração entre $n1 e $n2 é ${Calculadora.sub(n1, n2)}")

            }

            "3" -> {
                println("Digite o 1º valor: ")
                val n1 = readln().toInt()
                println("Digite o 2º valor: ")
                val n2 = readln().toInt()
                println("A multiplicação entre $n1 e $n2 é ${Calculadora.multi(n1, n2)}")
            }

            "4" -> {
                println("Digite o 1º valor: ")
                val n1 = readln().toInt()
                println("Digite o 2º valor: ")
                val n2 = readln().toInt()
                println("A divisão entre $n1 e $n2 é ${Calculadora.div(n1, n2)}")

            }

            "5" -> {
                println("Digite o valor da base: ")
                val n1 = readln().toDouble()
                println("Digite o valor do expoente: ")
                val n2 = readln().toDouble()
                println("A potência de $n1 no expoente $n2 é ${Calculadora.pot(n1, n2)}")
            }

            "6" -> {
                println("Digite o valor para calcularmos a raiz: ")
                val n1 = readln().toDouble()
                println("A raiz $n1 é ${Calculadora.rad(n1)}")

            }

            "7" -> break
        }
    }

}