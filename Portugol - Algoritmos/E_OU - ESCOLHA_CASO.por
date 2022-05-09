programa
{
	inclua biblioteca Matematica-->mat
	

	funcao inicio()
	{
		//Operadores Lógicos
	
		/*
		* e
		* ou
		* 
		* Tabela Verdade
		* 
		* e
		* 
		* VV - V
		* FV - F
		* VF - F
		* FF - F
		* 
		* ou
		* 
		* VV - V
		* FV - V
		* VF - V
		* FF - F
		* 
		*/
	
		//Exemplo prático utilizando os operadores lógicos
		//Conectivo e
	
		inteiro coracoes = 20, vidas = 456, x = 5, y = 0
	
		/*
		se(coracoes == 0 e vidas == 0){
			
			escreva("Tela de Game Over")
		
		}senao{
			
			escreva("Reiniciar o Jogo")
		
		}
		*/
	
		//Conectivo ou
		/*
		se(coracoes == 0 ou vidas == 0){
			
			escreva("Tela de Game Over")
		
		}senao{
			
			escreva("Reiniciar o Jogo")
		
		}
		*/
	
		//Calculadora de imc utilizando os operadores lógicos
	
		/*
		real peso, altura, imc
	
		escreva("Digite o seu peso: ")
		leia(peso)
	
		escreva("Digite o seu altura: ")
		leia(altura)
	
		imc = peso / mat.potencia(altura, 2.0)
	
		escreva("\nImc: ", mat.arredondar(imc, 1), "\n\n")
	
		se(imc < 18.5){
			
			escreva("Abaixo do peso")	
		
		}senao se(imc >= 18.5 e imc < 25.0){
			
			escreva("Peso Normal")	
		
		}senao se(imc >= 25.0 e imc < 30){
			
			escreva("Acima do Peso")	
			
		}senao se(imc >= 30 e imc < 40){
	
			escreva("Obesidade I")
			
		}senao{
			
			escreva("Obesidade II")	
			
		}
		*/
	
		//Exemplo utilizando escolha...caso
	
		/*
		 * 
		 * escolha(variavel){
		 * 
		 * 	caso valor:
		 * 		código que será executado, se a variável estiver com o valor
		 * 		correspondente
		 * 	caso contrario
		 * 		código que será executado, se a variável não estiver com nenhum dos
		 * 		valores correspondentes
		 * 
		 * }
		 * 
		 */
	
		 /*
		 inteiro num
	
		 escreva("Digite um número entre 1 e 12 para descobrir o mês correspondente: ")
		 leia(num)
	
		 escreva("\n")
	
		 escolha (num){
	
			caso 1:
				escreva("Janeiro")
				pare
			caso 2:
				escreva("Fevereiro")
				pare
			caso 3:
				escreva("Março")
				pare
			caso 4:
				escreva("Abril")
				pare
			caso 5:
				escreva("Maio")
				pare
			caso 6:
				escreva("Junho")
				pare
			caso 7:
				escreva("Julho")
				pare
			caso 8:
				escreva("Agosto")
				pare
			caso 9:
				escreva("Setembro")
				pare
			caso 10:
				escreva("Outubro")
				pare
			caso 11:
				escreva("Novembro")
				pare
			caso 12:
				escreva("Dezembro")
				pare
			caso contrario:
			
				escreva("Número inválido")
					
		 }
		 */
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */