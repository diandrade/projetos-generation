programa
{
	
	funcao inicio()
	{
		/*
		 * Vetores (ou Arrays) - São variáveis que armazenam múltiplos valores de tipo definido
		 * 
		 * Estrura
		 * 
		 * tipo identificador[tamanho]
		 * inteiro vetor[10]
		 * 
		 * inteiro vetor[] = {1, 3, 4, 5} 
		 * 
		 * Quando um vetor é declarado o seu tamanho não pode ser alterado, porém os valores
		 * internos podem ser alterados
		 * 
		 */

		 //Cada posição referente ao meu vetor é chamado de index

		//Exemplo de declaração de vetor
		/*
		inteiro vetor[10]

		inteiro vetor2[] = {5, 3, 4}
		*/

		//Exemplo de forma que funciona, mas que é HORRÍVEL

		/*
		inteiro num[3]

		num[0] = 5
		num[1] = 8
		num[2] = 6

		escreva(num[2])
		*/

		//Exemplo utilizando a maneira correta de iterar os valores do vetor
		/*
		cadeia nomes[5]

		para(inteiro i = 0; i < 5; i++){
			
			escreva("Digite o nome na posição ", i, ": ")
			leia(nomes[i])
			
		}

		para(inteiro i = 0; i < 5; i++){
			
			escreva("\n",nomes[i])	
			
		}
		*/

		/*
		 
		Leia o estudo de caso a seguir: 
		Maria chega à sua entrevista
		de emprego para o cargo de desenvolvedora java júnior e é solicitado 
		que resolva o problema a seguir:
		Considerando uma lista de números [-1, 3, 4, 2, 6], 
		desenvolva um algoritmo que seja capaz de identificar o menor número. 
		
		*/

		//Exemplo com o usuário digitando cada valor

		/*
		inteiro num[5], menor

		para(inteiro i = 0; i < 5; i++){
			
			escreva("\nDigite o ", i+1, "º número: ")
			leia(num[i])	
			
		}

		menor = num[0]

		para(inteiro i = 0; i < 5; i++){
			
			se(num[i] < menor){
				
				menor = num[i]	
				
			}	
			
		}

		escreva("O menor número do vetor é: ", menor)
		*/

		//Exemplo com valores pre-definidos

		inteiro num[] = {-1, 3, 4, 2, 6}, menor

		menor = num[0]

		para(inteiro i = 0; i < 5; i++){
			
			se(num[i] < menor){
				
				menor = num[i]	
				
			}	
			
		}

		escreva("O menor número do vetor é: ", menor)
		
		

		

		 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */