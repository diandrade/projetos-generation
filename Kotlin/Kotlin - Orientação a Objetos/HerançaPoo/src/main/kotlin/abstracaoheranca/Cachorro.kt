package abstracaoheranca

class Cachorro (nome: String, idade: Int): Animal(nome, idade) {
    override fun emitirSom() {
        println("AUAU")
    }

    fun correr() {
        println("Correndo atrás do motoqueiro safado")
    }
}