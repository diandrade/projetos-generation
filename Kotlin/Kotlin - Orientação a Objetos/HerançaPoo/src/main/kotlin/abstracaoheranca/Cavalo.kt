package abstracaoheranca

class Cavalo (nome: String, idade: Int): Animal(nome, idade) {
    override fun emitirSom() {
        println("POCOTO")
    }

    fun correr() {
        println("Correndo pelo vale em um dia ensolarado")
    }
}