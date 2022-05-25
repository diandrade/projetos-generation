package abstracaoheranca

fun main() {

val cachorro = Cachorro("Thunder",8)
val cavalo = Cavalo("Jeremias", 6)
val preguica = Preguica("Janaina", 2)

    /*
    println("O ${cachorro.nome} têm ${cachorro.idade} anos, fala ${cachorro.emitirSom()} e está ${cachorro.correr()}")
    println("O ${cavalo.nome} têm ${cavalo.idade} anos, fala ${cavalo.emitirSom()} e está ${cavalo.correr()}")
    println("A ${preguica.nome} têm ${preguica.idade} anos, fala ${preguica.emitirSom()} e está ${preguica.subirEmArvore()}")
    */


    println("Cachorro")
    cachorro.emitirSom()
    cachorro.correr()
    println("\n")

    println("Cavalo")
    cavalo.emitirSom()
    cavalo.correr()
    println("\n")

    println("Preguiça")
    preguica.emitirSom()
    preguica.subirEmArvore()
    println("\n")


}