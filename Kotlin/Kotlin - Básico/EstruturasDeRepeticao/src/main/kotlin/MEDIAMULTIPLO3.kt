/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

fun main (){

    var media = 0.0
    var soma = 0.0
    var contm = 0.0

    do {
        println("Insira vários números!")
        var num = readln().toInt()

        if(num % 3 == 0 && num != 0){
            contm ++
            soma += num
            media = soma/contm
        }

    }while (num != 0)
    println("A média dos valores multiplo de três inseridos é: $media")
}