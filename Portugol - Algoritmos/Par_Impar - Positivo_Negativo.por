programa
{
/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/
	
	inteiro num, result
	
	funcao inicio()
	{
		escreva("Insira um número inteiro: ")
		escreva("\n")
		leia (num)

		result = num % 2

		se (result == 0){
			escreva ("O número é par\n")
		}senao {
			escreva ("O número é impar\n")
		}
		se (num < 0){
			escreva ("O número é negativo\n")
		}senao {
			escreva ("O número é positivo\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */