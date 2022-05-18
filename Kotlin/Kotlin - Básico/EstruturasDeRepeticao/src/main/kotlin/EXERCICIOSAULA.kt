fun main () {
    /*var cont = 0
    var idade = 0
    var sexo = 0
    var opcao = 0
    var pCalmas = 0
    var mNerv = 0
    var hAgr = 0
    var outCalmos = 0
    var pNM40 = 0
    var pCM18 = 0

    while (cont < 5) {

        println("***Pessoa ${cont * 1}***")

        println("Digite a idade: ")
        idade = readln().toInt()

        println("Digite o sexo (1-Feminino / 2-Masculino / 3-Outros )")
        sexo = readln().toInt()

        println("Digite o comportamento: 1 - Calma, 2 - Nervosa, 3 - Agressiva")
        opcao = readln().toInt()

        if (opcao == 1) {
            pCalmas++
        }

        if (sexo == 1 && opcao == 2) {
            mNerv++
        }

        if (sexo == 2 && opcao == 3) {
            hAgr++
        }

        if (sexo == 3 && opcao == 1) {
            outCalmos++
        }

        if (opcao == 2 && idade > 40) {
            pNM40++
        }

        if (opcao == 1 && idade < 18) {
            pCM18++
        }

        cont++

    }

    println("O numero de pessoas calmas: $pCalmas")
    println("O numero de mulheres calmas: $mNerv")
    println("O numero de homens calmos: $hAgr")
    println("O numero de outros calmos: $outCalmos")
    println("O numero de pessoas nervosas com mais de 40 anos: $pNM40")
    println("O numero de pessoas calmas com menos de 40 anos: $pCM18")*/

    var idade = 0
    var p21 = 0
    var p50 = 0

    while (idade != -99){

        print("Digite uma idade: ")
        idade = readln().toInt()

        if(idade != -99) {
            if (idade < 21) {
                p21++
            } else if (idade > 50) {
                p50++
            }
        }
    }

    println("O número de pessoas menores de 21 anos de idade é $p21")
    println("O número de pessoas maiores de 50 anos de idade é $p50")

}


