//2- Faça um programa que entre com três números e coloque em ordem crescente.

fun main() {
    println("Insira o 1º valor: ")
    val a = readln()
    println("Insira o 2º valor: ")
    val b = readln()
    println("Insira o 3º valor: ")
    val c = readln()

    if (c > b && b > a) {
        println("$a > $b > $c")
    } else if (b > c && c > a) {
        println("$a > $c > $b")
    } else if (c > a && a > b) {
        println("$b > $a > $c")
    } else if (a > c && c > b) {
        println("$b > $c > $a")
    } else if (b > a && a > c) {
        println("$b > $a > $c")
    } else {
        println("$c > $b > $a")
    }
}