package Exercicio1

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

data class Person(
    private var nome: String,
    private var dataDeNascimento: String,
    private var altura: Double
) {
    private fun calculaIdade(dataDeNascimento: String):Int {
        val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val anoNascimento = LocalDate.parse(dataDeNascimento, formato)
        val anoAtual = LocalDate.now()
        return Period.between(anoNascimento, anoAtual).years
    }

    fun mostraInfo(): String = "$nome nasceu dia ${mostraDia()} de ${mostraMes()}, " +
            "tem ${calculaIdade(dataDeNascimento)} anos e possui ${altura}m de altura."

    private fun mostraDia(): String = "${dataDeNascimento[0]}${dataDeNascimento[1]}"

    private fun mostraMes(): String {
        return when (("${dataDeNascimento[3]}${dataDeNascimento[4]}").toInt()) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Março"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            else -> "Dezembro"
        }
    }
}