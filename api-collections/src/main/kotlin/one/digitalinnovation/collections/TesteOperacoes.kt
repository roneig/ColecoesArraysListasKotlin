package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0, 4001.0)

    for (salario in salarios){
        println(salario)
    }
    println("----------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")
    println("----------")
    val salarioMaiorQue2500 = salarios.filter { it > 2500.0}
    println("Salario.filter:  $salarioMaiorQue2500")
    salarioMaiorQue2500.forEach{ it -> println(it) }
    println("----------")
    println("Salarios > 2000 e < 5000 (qtd):  ${salarios.count{it in 2000.0..5000.0}}")
    println("Salarios = 4001.0 (val):  ${salarios.find{it == 4001.0}}")
    println("Salarios = 4001.0 (val):  ${salarios.find{it == 4002.0}}")

    println("existe Salario = 4001.0   ${salarios.any{it == 4001.0}}")
    println("existe Salario = 4002.0   ${salarios.any{it == 4002.0}}")



}
