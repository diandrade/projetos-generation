fun main (){
   println("Qual é a idade do nadador?: ")
   val idade : Int = readln().toInt()

    if (idade >= 5 && idade <= 7){
        println("Infantil A")
    }else if (idade >= 8 && idade <=11){
        println("Infantil B")
    }else if (idade >= 12 && idade <=13){
        println("Juvenil A")
    }else if (idade >= 14 && idade <=17){
        println("Juvenil B")
    }else if (idade >= 18){
        println("Adultos")
    }else {
        println("Idade inválida")
    }
}