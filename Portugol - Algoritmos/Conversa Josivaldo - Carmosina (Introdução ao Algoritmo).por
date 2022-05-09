programa
{
	
	funcao inicio()
	{

		//Comentários por linha e comentários por bloco

		// Código para escapar da maldição
		
		/*
		escreva("Olá Mundo\n")
		escreva("Ufa, escapei da maldição!")
		*/

		//Simulação de uma conversa top - Josivaldo e Carmosina

		/*escreva("Josivaldo - Opa, beleza?\nJosivaldo - Eae, vai responder não?\n")
		escreva("Carmosin - De boas, e você?\n")
		escreva("Josivaldo - To de boa também!\n")
		escreva("Carmosina - Ok, tchau!")*/

		//Variáveis, Tipos e Identificadores

		/*

			TIPOS PRIMITIVOS
			
			Inteiro - Armazenar números inteiros (ex: 1,2,3 ...)
			inteiro x = 5
			
			Real - Armazenar números reais (ex: 1.5, 2.6, 10.59 ...)
			real y = 5.26
			
			Caracter - Armazena apenas 1 caracter
			caracter letra = 'K' 
			
			Cadeia - Armazena uma cadeia de caracteres (Por exemplo, uma frase, uma palavra)
			cadeia nome = "Henrique"
			
			Lógico - Armazena valores de Verdadeiro ou Falso
			logico lampadaAcesa = falsa
		
		*/

		//Exemplo prático utilizando as variáveis

		/*cadeia nome = "Henrique"
		inteiro idade = 21
		real altura = 1.75
		logico gostoDeToddy = verdadeiro
		*/

		//Concatenação de valores utilizando ou uma , ou o símbolo de +

		//escreva("Olá, meu nome é ", nome,", tenho ", idade, " de idade, além disso tenho ", altura, " de altura e é ", gostoDeToddy, " que eu gosto de Toddy")

		//Exemplo de código interagindo diretamente com o usuário.

		cadeia nome,comidaFavorita
		inteiro idade
		real altura
		

		escreva("Wally - Olá, digite o seu nome: ")
		leia(nome) //Comando para receber os inputs do usuário

		escreva("Wally - Agora, digite sua idade: ")
		leia(idade) 

		escreva("Wally - Boa, digite sua altura: ")
		leia(altura)

		escreva("Wally - Quero te conhecer melhor, qual a sua comida favorita? ")
		leia(comidaFavorita)

		escreva("\n***Cadastro Realizado***\n")
		escreva("Wally - Então, seu nome é ", nome, ", você têm ", idade , " anos, ", altura, " de altura e sua comida favorita é ", comidaFavorita)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1608; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */