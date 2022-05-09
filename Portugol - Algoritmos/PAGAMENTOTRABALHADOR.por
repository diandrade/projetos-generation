programa
{
/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.*/
	
	funcao inicio()
	{
		inteiro codigo, horas, salH = 10, excesso ,valE, salT
		
			escreva("Insira seu código: ")
				leia(codigo)
			escreva("Insira a quantidade de horas trabalhadas: ")
				leia(horas)

		se (horas > 50){
			excesso = horas - 50
		}senao{
			excesso = 0
		}
			valE = excesso * 20
			salH = horas * 10
			salT = valE + salH
			escreva("O salário total é igual a R$ ", salT)
			escreva("\n")
			escreva("O salário excedente é igual a R$ ", valE)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 920; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */