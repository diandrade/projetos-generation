programa
{
	

	funcao inicio()
	{
		/*
		 * Enquanto - Repete o bloco de código enquanto a condição for verdadeira
		 * 
		 * enquanto(condicao){
		 * 
		 * 
		 * 	codigo que vai se repetir enquanto a condição for verdadeira
		 * 
		 * }
		 * 
		 */


		//Exemplo prático utilizando o enquanto
		
		/*inteiro num = 0
	
		enquanto(num <= 10){
			
			escreva("\nDigite um número menor ou igual a 10: ")
			leia(num)	
			
		}*/
		
		
	
		//Exemplo enquanto utlizando cadeia
		/*
		cadeia texto = "loop"
	
		enquanto(texto == "loop" ou texto == "opa"){
			
			escreva("Digite Loop para rodar o código novamente: ")
			leia(texto)	
			
		}
		*/
	
		/*
		 * 
		 * faca...enquanto - Executa o bloco de código pelo menos uma vez e repete se a condição
		 * for verdadeira
		 * 
		 * faca{
		 * 
		 * 	bloco que será executado pelo menos uma vez
		 * 
		 * }enquanto(condicao)
		 * 
		 */


		//exemplo prático faca...enquanto
	
		
		/*cadeia resp = "sodifujlkaoiefds"
		inteiro cont
		= 0
	
		faca{
			
			escreva("Tem o Pete e o Repete, o Pete morreu, quem sobrou?\n")
			leia(resp)
	
			se(resp != "Repete"){
	
				escreva("Aff, se descobriu!")
				
			}
	
			//cont = cont + 1
			cont++
	
			se(cont >= 10){
				
				escreva("\nCaraca, sério mesmo que vc ainda n se tocou?")	
			
			}
			
		}enquanto((resp == "Repete" ou resp == "repete") e cont < 10)
		*/
		
	
		//Exemplo de um looping infinito
		/*
		inteiro num = 0
	
		enquanto(num < 10){
			
			escreva("k")
			num++	
			
		}
		*/
	
		/*
		 * 
		 * para - Vai repetir o código por meio de uma condição controlada por uma variável
		 * de controle
		 * 
		 * para(declarar a variavel de controle; condicao; comportamento da variavel){
		 * 
		 * 	Codigo que será repetido enquanto a condicao for verdadeira
		 * 
		 * }
		 * 
		 */
	
		//exemplo tabuada utilizando o para
	
		
		inteiro num
	
		escreva("Digite um número para calcularmos a tabuada: ")
		leia(num)
	
		para(inteiro controle = 10; controle > 0; controle--){
			
			escreva("\n",num, "X", controle, " = ", num * controle)	
			
		}
		
		 
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */