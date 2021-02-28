package Exercicio3

open class Funcionario(
    private var id : Int,
    private var nome : String,
    private var cpf : String,
    private var salario : String
) {

    override fun toString() : String =
        """
                    INFORMAÇÕES DO FUNCIONARIO: 
            ID: $id 
            Nome: $nome
            cpf: $cpf
            salario: $salario
        """.trimIndent()
}

// todo Salvar os dados (como ID, nome, CPF e salario atual)
//   de um funcionario e ao final perguntar se ele e gestor ou programador,
//   e so assim, instanciar