fun main (){

    val cliente = Cliente(
        "Joice",
        "F",
        23,
        72.9,
        "123.321.231-00",
        "23.012.210-1",
        "contato.joice@yahoo.com",
        "(13)90121-3231"
    )

    println("O nome da cliente é ${cliente.nome}")
    println("O cpf da cliente é ${cliente.cpf}")
    println("O número da cliente é ${cliente.telefone}")

    cliente.comprar()
}
