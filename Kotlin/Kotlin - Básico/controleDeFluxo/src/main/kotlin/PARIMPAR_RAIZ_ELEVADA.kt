import kotlin.math.pow
import kotlin.math.sqrt

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

fun main () {
    println("Insira um número qualquer!!")
    val num : Double = readln().toDouble()

    val result = num % 2

    if (result == 0.0 && num > 0.0){
        println("O valor da raiz quadrada de $num é ${sqrt(num)} e ele é par")

    }else if (result != 0.0 && num > 0.0){
        println("O valor da raiz quadrada de $num é ${sqrt(num)} e ele é impar")

    }else if (result == 0.0 && num < 0.0) {
        println("O valor de $num elevado ao quadrado é ${num.pow(2)} e ele é par")
    }else {
        println("O valor de $num elevado ao quadrado é ${num.pow(2)} e ele é impar")
    }
}