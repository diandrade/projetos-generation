/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

data class ProdutoEletronico(
    var tipo: String, var nome: String,
    var fabricante: String, var ano: String,
    var modelo: String, var id: String,
    var peso: Double, var preco: Double
)

