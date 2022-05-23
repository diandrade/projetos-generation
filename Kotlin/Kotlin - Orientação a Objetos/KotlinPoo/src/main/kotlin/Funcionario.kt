/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

data class Funcionario (
    var identificador : Int, var nome : String,
    var sexo : String, var idade : Int,
    var profissao : String, var setor : String,
    var salario : Double, var escolaridade : String,
    var endereco : String, var nacionalidade :String

        )
