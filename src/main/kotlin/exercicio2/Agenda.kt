package exercicio2

class Agenda<T> {
    private val map = mutableMapOf<String, T>()

//  todo ->  Salvar contato: ao inserir o nome e o telefone de uma
//    pessoa e ela não constar na agenda, salva então o seu
//    contato na agenda;

    fun create(id : String, value : T) = value.also { map[id] = it }

// todo -> b. Remover contato: ao inserir o nome e o telefone de uma
//  pessoa e ela constar na agenda, seu contato é
//  removido. Caso ela não exista, informar ao usuário;

    fun remove(id : String) = map.remove(id)

// todo -> c. Buscar contato: ao inserir um nome, retornar seus
//  dados. Se tiver mais de um resultado, exemplo, dois
//  contatos de nome Juliana salvos com telefones
//  diferentes, exibir ambos;

    fun findById(id : String) = map[id]

// todo -> Mostrar agenda completa com todos os contatos
//  salvos.

    fun findAll() = map.values
}