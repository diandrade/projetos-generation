/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

fun main() {

    println("Insira a idade da pessoa: ")

    when (readln().toInt()) {
        in 10..14 -> println("Infantil")
        in 15..17 -> println("Juvenil")
        in 18..25 -> println("Adulto")
        else -> println("Valor Inválido")
    }
}

