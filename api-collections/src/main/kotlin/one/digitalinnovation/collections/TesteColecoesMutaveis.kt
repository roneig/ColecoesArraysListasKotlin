package one.digitalinnovation.collections

fun main() {
    val  joao   = Funcionario("joao", 2000.0, "CLT" )
    val  pedro  = Funcionario("pedro", 1500.0, "PJ" )
    val  maria  = Funcionario("maria", 4000.0, "CLT" )
    println("-------LIST----------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it)}
    println(">--adiciona pedro --------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it)}
    println(">--remove pedro --------------")
    funcionarios.remove(pedro)
    funcionarios.forEach{ println(it)}
    println("-------SET----------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{ println(it)}
    println(">--adiciona pedro  e maria --------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{ println(it)}
    println(">--remove joao --------------")
    funcionarioSet.remove(joao)
        funcionarioSet.forEach{ println(it)}


}