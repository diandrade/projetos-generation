programa
{
	
	funcao inicio()
	{
		//Operadores Aritméticos

		/*
			Adição
			Subtração
			Divisão
			Multiplicação
			Módulo (Só funciona com números inteiros)
		*/

		//Utilização

		/* real num1, num2, resultado

		escreva("Digite o primeiro número: ")
		leia(num1)

		escreva("Digite o segundo número: ")
		leia(num2)

		resultado = (num1+num2) / 5

		escreva ("\nO resultado é: ", resultado)
		*/

		/*
		inteiro num1 = 10, num2 = 2

		escreva(num1 % num2)
		*/

		//Exemplo prático de calculadora de média

		real n1, n2, n3, n4, media

		escreva("Digite a nota 1: ")
		leia(n1)
		
		escreva("Digite a nota 2: ")
		leia(n2)
		
		escreva("Digite a nota 3: ")
		leia(n3)
		
		escreva("Digite a nota 4: ")
		leia(n4)

		media = (n1+n2+n3+n4)/4

		

		//Estrutura Condicional
		
		/*
			se...senao

			se(condicao){

				O código que será utilizado se a condiçaõ for verdadeira

			}
			senao{

				O código será utilizado quando a condição for falsa
			}

			Operadores Relacionais: 

			== - Verifica se um valor é igual a outro
			!= - Verifica se um valor é diferente de outro 
			> - Verifica se um valor é maior que outro
			< - Verifica se um valor é menor que outro
			>= - Verifica se um valor é maior ou igual a outro
			
			
			<= - Verifica se um valor é menor ou igual a outro
		*/

		//Exemplo de se simples

		/*se(media <= 4){
			escreva("\nVocê foi REPROVADO >:^")
			}
		senao{
			escreva("\nParabêns!, você foi APROVADO <:^")
			}
		*/

		//Exemplo de se composto

		se(media <= 4){
			escreva("A média está péssima")
		
		}senao se(media <= 6){
			escreva("A média está regular")
		
		}senao se(media <= 8){
			escreva("A média está boa")
		
		}senao se(media <= 9){
			escreva("A média está ótima")
		
		}senao{
			escreva("A média está excelente!")}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 686; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */