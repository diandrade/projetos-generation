/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

data class Aviao(
    var fabricante: String, var modelo: String,
    var assentos: Int, var altura: Double,
    var comprimento: Double, var pais: String,
)

{

    var voar = false
    var luzes = false

    constructor(
         fabricante: String,  modelo: String,
         assentos: Int,  altura: Double,
         comprimento: Double,  pais: String,
         voar: Boolean
    ): this (fabricante, modelo, assentos, altura, comprimento, pais){
       this.voar = voar
    }

    constructor(
        fabricante: String,  modelo: String,
        assentos: Int,  altura: Double,
        comprimento: Double,  pais: String,
        voar: Boolean, luzes:Boolean
    ):  this (fabricante, modelo, assentos, altura, comprimento, pais){
        this.luzes = luzes
    }

    fun voando(){
        if(voar){
            println("O avião está voando!")
        }else{
            println("O avião está esperando análise da torre de comando.")
        }
    }

    fun iluminar(){
        if(luzes && voar){
            println("O avião está iluminando as estrelas!")
        }else if (luzes && !voar){
            println("O avião está iluminando o asfalto!")
        }else if (!luzes && voar){
            println("O avião está apagado no meio do ar!")
        }else {
            println("O avião está apagado no chão >:")
        }
    }


}
