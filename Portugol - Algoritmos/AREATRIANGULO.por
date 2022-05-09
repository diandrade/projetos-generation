programa
{/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
Em caso afirmativo, calcular a área do triângulo.
*/
	
	funcao inicio()
	{
		real base, altura, area
	
		escreva("Insira o valor da base do triângulo: ")
			leia (base)
		escreva("Insira o valor da altura do triângulo: ")
			leia (altura)

		se (base > 0 e altura > 0){
			area = (base*altura)/2

			escreva ("A área do triângulo é ", area)
		}senao {
			escreva ("Valor inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */