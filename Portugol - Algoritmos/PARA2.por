programa
{/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
e que se encontram no conjunto dos números de 1 até 500.*/
	
	funcao inicio()
	{
		
		inteiro num, valor, multiplo, soma = 0
		
		para (num = 1;num <= 500; num++){
			
			valor = num % 2
			multiplo = num % 3

			
			
			se (valor != 0 e multiplo == 0){
				soma += num
				escreva (soma, "\n") 
				
			}
			 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */