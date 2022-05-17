//Faça um programa que receba tres inteiros e diga qual deles é o maior

fun main() {

    print("Insira o 1º valor: ")
    val a = readln()
    print("Insira o 2º valor: ")
    val b = readln()
    print("Insira o 3º valor: ")
    val c = readln()

    if (a > b && a > c) {
        print("O maior valor é $a")
    } else if (b > a && b > c) {
        print("O maior valor é $b")
    } else {
        print("O maior valor é $c")
    }

}