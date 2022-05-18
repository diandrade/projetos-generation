/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

fun main (){

    for (i in 1000 .. 1999 step 1){
        if (i % 11 == 5){
           println(i)
        }
    }
}