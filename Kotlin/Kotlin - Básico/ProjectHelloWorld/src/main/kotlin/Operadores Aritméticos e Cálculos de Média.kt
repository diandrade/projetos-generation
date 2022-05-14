/*fun main () {
    fun printDouble(num1 : Int) {print(num1)}

    val num1 = 1

    printDouble(num1)
}*/ //Declaração de Variável Numérica I

/*fun main () {
    val num1 = 1.5
    val num2 = 2.9
    val num3 = 3.2
    val media = (num1+num2+num3)/3

    print(media)
}*/ //Declaração de Variável Numérica II

/*fun main (){
    println (10/5)
    println (10/3)

    }*/ //Divisão entre 2 números inteiros sempre vai resultar em um número inteiro

/*import java.math.RoundingMode
import java.text.DecimalFormat

//Entrada de Dados
fun main () {
    println("Insira o valor da 1º nota: ")
        val num1: Double = readLine()!!.toDouble()
    println("Insira o valor da 2º nota: ")
        val num2: Double = readLine()!!.toDouble()
    println("Insira o valor da 3º nota: ")
        val num3: Double = readLine()!!.toDouble()

//Processamento de Dados
    val media: Double = (num1+num2+num3)/3
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    val roundoff = df.format(media)

//Saída de Dados
    println("1º Nota: $num1")
    println("2º Nota: $num2")
    println("3º Nota: $num3")
    println("A média final das notas é $roundoff")

}*/ //Importação de Biblioteca de Arredondamento / Tipos de valores (Float/Double/val)

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    println("Insira o valor da 1º nota: ")
    val num1: Double = readLine()!!.toDouble()
    println("Insira o valor da 2º nota: ")
    val num2: Double = readLine()!!.toDouble()
    println("Insira o valor da 3º nota: ")
    val num3: Double = readLine()!!.toDouble()

//Processamento de Dados
    val media: Double = (num1 + num2 + num3) / 3
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    val roundoff = df.format(media)

    //Saída de Dados
    /*if(media >= 6) {
        println("A média final das notas é $roundoff e você está APROVADO <:^" )
    }else{
        println("A média final das notas é $roundoff e você está REPROVADO >:^" )
    }*/

    if (media <= 4) {
        println("A média está péssima")
    } else if (media <= 6) {
        println("A média está regular")
    } else if (media <= 8) {
        println("A média está boa!")
    } else if (media <= 9) {
        println("A média está ótima!!")
    } else {
        println("A média está excelente!!!")
    }


} //IF ELSE Exemplos práticos!!



