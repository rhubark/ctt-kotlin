import Exercicio1.Person
import exercicio2.Contato
import exercicio2.Agenda

fun main() {
    //testaExercicio1()
    //testaExercicio2()

}

fun testaExercicio2() {
    val contato1 = Contato("Woody", 1111_1111)
    val contato2 = Contato("Buzz", 2222_2222)
    val contato3 = Contato("Jessie", 3333_3333)
    val contato4 = Contato("Batata", 4444_4444)
    val contato5 = Contato("Rex", 5555_5555)
    val contato6 = Contato("Slinky", 6666_6666)
    val contato7 = Contato("Betty", 7777_7777)
    val contato8 = Contato("Porquinho", 8888_8888)
    val contato9 = Contato("Wheezy", 9999_9999)
    val contato10 = Contato("sid", 1000_0000)

    val Contato = Agenda<Contato>()

    Contato.create(contato1.nome, contato1)
    Contato.create(contato2.nome, contato2)
    Contato.create(contato3.nome, contato3)
    Contato.create(contato4.nome, contato4)
    Contato.create(contato5.nome, contato5)
    Contato.create(contato6.nome, contato6)
    Contato.create(contato7.nome, contato7)
    Contato.create(contato8.nome, contato8)
    Contato.create(contato9.nome, contato9)
    Contato.create(contato10.nome, contato10)

    println(Contato.findById(contato2.nome))

    println("----------------------")
    Contato.findAll().forEach { println(it) }

    println("----------------------")
    Contato.remove(contato10.nome)
    Contato.findAll().forEach { println(it) }
}

fun testaExercicio1() {
    val Rhuan = Person(
        nome = "Rhuan",
        dataDeNascimento = "25/12/1991",
        altura = 1.77
    )
    val Fulana = Person(
        nome = "Fulana",
        dataDeNascimento = "06/02/1990",
        altura = 1.97
    )
    println(Rhuan.mostraInfo())
    println(Fulana.mostraInfo())
}