programa
{	inclua biblioteca Matematica-->mat
	
	
	funcao inicio()
	{
		real peso, altura, imc

		escreva("Digite o peso: ")
		leia(peso)

		escreva("Digite a altura: ")
		leia(altura)

		imc = peso/(mat.potencia(altura, 2.0))
		se (imc <= 18.4){
			escreva ("\n Seu IMC é: ", (mat.arredondar(imc, 1))," e ele é classificado como Abaixo do Peso Ideal")
		}

		senao se (imc <= 24.9){
			escreva ("\n Seu IMC é: ", (mat.arredondar(imc, 1))," e ele é classificado como Peso Ideal")
		}

		senao se (imc <= 29.9){
			escreva ("\n Seu IMC é: ", (mat.arredondar(imc, 1))," e ele é classificado como Acima do Peso")
		}

		senao se (imc <= 39.9){
			escreva ("\n Seu IMC é: ", (mat.arredondar(imc, 1))," e ele é classificado como Obesidade I")
		}

		senao {
			escreva ("\n Seu IMC é: ", (mat.arredondar(imc, 1))," e ele é classificado como Obesidade II ou Maior")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */