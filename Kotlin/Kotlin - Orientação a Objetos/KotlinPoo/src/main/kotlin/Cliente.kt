/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

data class Cliente(
    var nome: String, var sexo: String,
    var idade: Int, var peso: Double,
    var cpf: String, var rg: String,
    var email: String, var telefone: String
)

{
    var saldo = 0.0

    constructor( nome: String, sexo: String,
    idade: Int, peso: Double,
    cpf: String, rg: String,
    email: String, telefone: String, saldo: Double
    ):this (nome, sexo, idade, peso, cpf, rg, email, telefone){
    this.saldo = saldo}

    fun comprar (){
        println("Insira o saldo atual da cliente: ")
        val saldo = readln().toDouble()
        println("Insira o nome do produto:")
        val nomeP = readln()
        println("Insira o preço do produto: ")
        val preco = readln().toDouble()
        if(saldo - preco > 0) {
            println("O produto $nomeP foi comprado com sucesso e você possui R$${saldo - preco} de saldo! <:")
        }else if(saldo - preco == 0.0){
            println("O produto $nomeP foi comprado com sucesso, porém você não possui saldo.")
        }else{
            println("Infelizmente, você não possui saldo para a compra >:")
        }
    }
}
