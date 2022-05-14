fun main () {
    println("Insira um número inteiro: ")
    val num: Int = readln().toInt()

    val result : Int = num % 2

    if (result == 0){
        println("O número é par")
    }else{
        println("O número é impar")
    }

    if (num < 0){
        println("O número é negativo")
    }else{
        println("O número é positivo")
    }
}