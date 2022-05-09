programa
{
	
	funcao inicio()
	{
		/*cadeia nome[5]

		nome[0] = "Marcelo"
		nome[1] = "Tiago"
		nome[2] = "Juliana"
		nome[3] = "Priscila"
		nome[4] = "Maurício"
	
		escreva(nome[2])*/

		/*cadeia cat[] = {"Ni","Pt","Pd","Rh"}

		para(inteiro i = 0; i <= 3; i++){
			escreva(cat[i], "\n")
		}*/

			cadeia nome [5]
			
			para(inteiro i = 0;i <=4; i++){
				escreva("Digite a posição ", i,": ")
				leia(nome[i])
				limpa()
			}

			para(inteiro i = 0; i<= 4; i++){
				escreva(i , ": ", nome[i], "|")
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */