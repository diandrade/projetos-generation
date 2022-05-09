programa
{
/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos. 
O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
	
	funcao inicio()
	{
		real soma = 0.0, media = 0.0, total = 0.0, num = 0.0, cont = 1.0
		escreva ("Insira um valor: ")
			leia (num) 


		enquanto (num > 0){
			soma += num 
			media = soma/cont
			
			escreva ("Insira um valor: ")
				leia (num)
				cont++
			
		}
			escreva ("A soma dos valores inseridos é: ", soma)
			escreva ("\n")
			escreva ("A média dos valores inseridos é: ", media)
			escreva ("\n")
			escreva ("Foram contados ",cont, " valores.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */