//1 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele
//C = 2 * π * r, onde: C = comprimento da circunferência ou perímetro.
fun main (){

    println("Insira o diâmetro do circulo: ")
    val diam = readln().toDouble()
    println("A área do círculo é ${((diam*diam)*3.14)/4}")
    println("O perímetro do círculo é ${diam*3.14}")
}