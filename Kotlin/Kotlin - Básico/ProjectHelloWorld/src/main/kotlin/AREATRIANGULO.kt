fun main (){
    println("Insira o valor da base do triângulo:")
    val base : Double = readln().toDouble()
    println("Insira o valor da altura do triângulo:")
    val altura : Double = readln().toDouble()

    if(base > 0 && altura > 0){
        val area : Double = (base*altura)/2

        println("A área do triângulo é $area m²")
    }else{
        println("Valor inválido")
    }
}