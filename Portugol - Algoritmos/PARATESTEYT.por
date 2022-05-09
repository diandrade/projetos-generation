programa
{

	// calcule a média de 5 notas
	
	funcao inicio()
	{
		real nota, media, somaNotas = 0.0
		inteiro contador
		
		para(contador = 1; contador <= 5; contador++){
			escreva("Digite uma nota: ")
			leia(nota)
			somaNotas = somaNotas + nota
		}
		media = somaNotas / 5
		escreva ("Média: ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */