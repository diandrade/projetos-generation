package abstracaoheranca

class Preguica (nome: String, idade: Int): Animal(nome, idade) {
    override fun emitirSom() {
        println("............. (dormindo)")
    }

    fun subirEmArvore() {
        println("Vivendo minha jornada ao topo da árvore!")
    }
}