programa
{
	
/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
	
	funcao inicio()
	{

		inteiro n1,n2,n3,n4,n5,n6,n7,n8
		
		escreva("Insira o 1º valor: ")
			leia (n1)
		escreva("Insira o 2º valor: ")
			leia (n2)	
	    escreva("Insira o 3º valor: ")
			leia (n3)
		escreva("Insira o 4º valor: ")
			leia (n4)

		n5 = n1*n1
		n6 = n2*n2
		n7 = n3*n3
		n8 = n4*n4

		se (n7 >= 1000){
			escreva (n7)
		}senao {
			escreva ("O quadrado de ",n1," é ",n5)
			escreva ("\n")
			escreva ("O quadrado de ",n2," é ",n6)
			escreva ("\n")
			escreva ("O quadrado de ",n3," é ",n7)
			escreva ("\n")
			escreva ("O quadrado de ",n4," é ",n8)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 798; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */