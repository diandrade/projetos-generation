package classes

data class Cliente(private var nome: String, private var endereco: String,
private var telefone:String){

    var saldo = 0.0
    var idade = 0

    constructor(
         nome: String, endereco: String,
         telefone:String, saldo: Double
    ): this(nome, endereco, telefone){
        this.saldo = saldo
    }

    constructor(
        nome: String, endereco: String,
        telefone:String, saldo: Double, idade: Int
    ): this(nome, endereco, telefone, saldo){
        this.idade = idade
    }

        /*init {
            if (nome == ""){
                throw Exception("A classe foi instanciada de maneira incorreta!")
            }
        }*/

        fun dados(){
            println("Insira seu nome: ")
            nome = readLine().toString()
            println("Insira seu endereço: ")
            endereco = readLine().toString()
            println("Insira seu telefone: ")
            telefone = readln()
            println("Insira seu saldo: ")
            saldo = readln().toDouble()
            println("Insira sua idade: ")
            idade = readln().toInt()
        }

        fun infoCliente() {
                println("Informações do Cliente: ")
                println("Nome: $nome ")
                println("Endereço: $endereco")
                println("Telefone: $telefone")
                println("Saldo: $saldo")
                println("Idade: $idade")
            }



}