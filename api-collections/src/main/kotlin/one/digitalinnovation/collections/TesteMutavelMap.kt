package one.digitalinnovation.collections

fun main() {
    val  joao   = Funcionario("joao", 2000.0, "CLT" )
    val  pedro  = Funcionario("pedro", 1500.0, "PJ" )
    val  maria  = Funcionario("maria", 4000.0, "CLT" )
    println("------Mutable Map ----------")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println("find by id: \n ${repositorio.findById(pedro.nome)}")
    //println("find all: \n ${repositorio.findAll()} ")
    println("------find all ----------")
    repositorio.findAll().forEach{ println(it) }

    println("------ remove ----------")
    println("remove: \n ${repositorio.remove(pedro.nome)}")
    println("------ sobrou ----------")
    repositorio.findAll().forEach{ println(it) }




}