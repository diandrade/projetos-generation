fun main (){
    val boeing = Aviao(
        "Gol",
        "Boeing 737-800",
        186,
        12.5,
        39.5,
        "Brasil"
    )

    println("A fabricante do ${boeing.modelo} é a ${boeing.fabricante} e ele opera no ${boeing.pais}")

    boeing.voando()
    boeing.iluminar()
}