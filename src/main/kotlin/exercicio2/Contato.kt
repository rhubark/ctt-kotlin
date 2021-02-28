package exercicio2

data class Contato(
    val nome : String,
    val Telefone : Int,
) {
    override fun toString() : String =
        """
            Nome: $nome 
            Telefone: $Telefone
        """.trimIndent()
}