fun main() {
    println("Insira qual é o grupo de sua empresa : (1, 2, 3).")
    val grupo: String = readln()
    println("Insira qual é o índice atual de sua empresa: ")
    val indice: Double = readln().toDouble()

    if (grupo == "1") {
        if (indice <= 0.3) {
            println("Suspenda as atividades imediatamente")
        } else if (indice > 0.3 && indice <= 0.5) {
            println("Paralizem suas atividades em cerca de 2 semanas.")
        } else {
            println("Vocês estão autorizados a continuarem suas atividades.")
        }
    } else if (grupo == "2" || grupo == "3") {
        if (indice <= 0.4) {
            println("Suspenda as atividades imediatamente!")
        } else if (indice > 0.4 && indice <= 0.5) {
            println("Paralizem suas atividades em cerca de 2 semanas.")
        } else {
            println("Vocês estão autorizados a continuarem suas atividades.")
        }
    } else {
        println("Grupo Desconhecido")
    }
}