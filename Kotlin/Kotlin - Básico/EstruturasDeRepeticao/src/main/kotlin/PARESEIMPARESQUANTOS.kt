/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

fun main (){

    var contp = 0
    var conti = 0


    for(i in 78 .. 100 step 1){
        if (i % 2 == 0){
            contp += 1
        }else{
            conti += 1
        }

    }
    println("Temos $contp números pares")
    println("Temos $conti números impares")
}