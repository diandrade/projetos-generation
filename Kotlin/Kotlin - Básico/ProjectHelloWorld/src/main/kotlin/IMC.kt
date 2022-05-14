import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    println("Digite o peso: ")
    val peso : Double = readln().toDouble()

    println("Digite a altura: ")
    val altura : Double = readln().toDouble()

    val imc : Double = peso/(altura*altura)
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val roundoff = df.format(imc)

    if (imc <= 18.4){
        println("Seu IMC é $roundoff e ele é classificado como Abaixo do Peso Ideal")
    }else if (imc <= 24.9){
        println("Seu IMC é $roundoff e ele é classificado como Peso Ideal")
    }else if (imc <= 29.9){
        println("Seu IMC é $roundoff e ele é classificado como Acima do Peso Ideal")
    }else if (imc <= 39.9){
        println("Seu IMC é $roundoff e ele é classificado como Obesidade I")
    }else {
        println("Seu IMC é $roundoff e ele é classificado como Obesidade II")
    }
}