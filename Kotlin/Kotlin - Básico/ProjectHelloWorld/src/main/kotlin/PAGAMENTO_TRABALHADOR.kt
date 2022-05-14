fun main() {
    println("Insira seu código: ")
    val codigo: Int = readln().toInt()
    println("Insira a quantidade de horas trabalhadas: ")
    val horas: Int = readln().toInt()

    val salT: Int


    val excesso: Int = if (horas > 50) {
        horas - 0
    } else {
        0
    }

    val valE: Int = excesso * 20
    val salH: Int = horas * 10
    salT = valE + salH

    println("O salário total de $codigo é igual a R$ $salT")
    println("O salário excedente é igual a R$ $valE")
}

