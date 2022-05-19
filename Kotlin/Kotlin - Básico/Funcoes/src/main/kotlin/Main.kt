fun main (){

/*
    Funções - Blocos de código que poderes chamar a qualquer momento dentro
    do nosso código

    Funções com retorno - Eles servirão para retornarmos um valor que conseguiremos
    armazenar dentro de uma variável ou simplesmente exibir através de, por exemplo,
    um println

    Funções sem retorno - Elas servirão para a gente conseguir executar
    uma bloco de código que vai exibir ou fazer mudanças específicas dentro
    do nosso código

     */

/*
//Exemplo de uma função sem retorno
println("dskjfklsdzaf")

//Exemplo de uma função com retorno
val nome = readln()
 */

//Exemplo de código sem utilizar uma função
/*
var vida = 10

//Inimigo nos deu 2 de dano
vida -= 2

/*
if(vida <= 0){
    println("Você está morto!")
}else if(vida in 1..3){
    println("Você está morrendo...")
}else if(vida in 4..7){
    println("Você está bem")
}else if(vida in 8..9){
    println("Você está ótimo")
}else{
    println("Sua vida está cheia!")
}
 */
 */

/*
Estrutura de uma função

fun identificador (parametros): Tipo{

    Bloco de código que será executado cada vez que a função for chamada

}
 */

//Exemplo utilizando uma função sem retorno
/*
var vida = 10

//Inimigo nos deu 2 de dano
vida -= 2
//Exemplo chamando a função
estadoPersonagem(vida)

//Inimigo nos deu 3 de dano
vida -= 3
estadoPersonagem(vida)

escreva_oi()
escreva_oi()
escreva_oi()
escreva_oi()
 */

/*
//Chamando a função com retorno de diversas formas diferentes
println("Digite o seu nome para ver ele em letras maiusculas: ")
val nome = readln()

println("O seu nome em letras maiúsculas é: ${caracteresMaiusculos(nome)}")

//Chamando a função com retorno de diversas formas diferentes
println("Digite o seu nome para ver ele em letras maiusculas: ")
val nome2 = readln()
val maiusculo = caracteresMaiusculos(nome2)

println("O seu nome em letras maiúsculas é: $maiusculo")

//Chamando a função com retorno de diversas formas diferentes
println("Digite o seu nome para ver ele em letras maiusculas: ")
val nome3 = caracteresMaiusculos(readln())

println("O seu nome em letras maiúsculas é: $nome3")
 */

}

//Parâmetros - Informações obrigatórias que precisaremos passar no momento em que formos
//chamar a nossa função
fun estadoPersonagem(vida: Int){
    if(vida <= 0){
        println("Você está morto!")
    }else if(vida in 1..3){
        println("Você está morrendo...")
    }else if(vida in 4..7){
        println("Você está bem")
    }else if(vida in 8..9){
        println("Você está ótimo")
    }else{
        println("Sua vida está cheia!")
    }
}

fun escreva_oi(){
    println("oi")
}

//Função com retorno para retornar um conjunto de caracteres em letras maiúsculas
fun caracteresMaiusculos(valor: String): String{
    val maiusculo = valor.uppercase()
    return maiusculo
}