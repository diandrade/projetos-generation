fun main() {
    println("Insira o 1º valor: ")
    val n1: Int = readln().toInt()
    println("Insira o 2º valor: ")
    val n2: Int = readln().toInt()
    println("Insira o 3º valor: ")
    val n3: Int = readln().toInt()
    println("Insira o 4º valor: ")
    val n4: Int = readln().toInt()

    val n5 : Int = n1*n1
    val n6 : Int = n2*n2
    val n7 : Int = n3*n3
    val n8 : Int = n4*n4

    if (n7 >= 1000){
        println(n7)
    }else{
        println("O quadrado de $n1 é $n5")
        println("O quadrado de $n2 é $n6")
        println("O quadrado de $n3 é $n7")
        println("O quadrado de $n4 é $n8")
    }
}