/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

fun main() {

    var soma = 0
    do {
        println("Insira um dígito: ")
        var digit = readln().toInt()
        soma += digit
    } while (digit != 0)
    println("A soma dos valores digitados é $soma")



}