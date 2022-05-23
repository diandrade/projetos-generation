fun main (){

   val dispositivo = ProdutoEletronico(
       "Celular",
       "Iphone 8",
       "Apple Computer",
       "2017",
       "864-SGR-UNL",
       "MQ6K2LL/A",
       147.98,
       1.699
   )

   println("Atualmente, o ${dispositivo.nome} fornecido pela ${dispositivo.fabricante} está custando cerca de R$${dispositivo.preco}")

}