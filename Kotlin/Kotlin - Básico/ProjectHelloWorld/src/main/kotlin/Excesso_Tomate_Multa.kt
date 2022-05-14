fun main() {
    println("Qual o peso do tomate?")
    val peso: Int = readln().toInt()

    val excesso: Int = peso - 50

    if (peso in 1..50) {
        println("Peso válido dentro do regulamento")
    } else if (peso < 0) {
        println("Peso inválido")
    } else {
        val multa: Int = excesso * 4
        println("A multa aplicada a quantidade de peso inserido, é de R$ $multa")
    }
}