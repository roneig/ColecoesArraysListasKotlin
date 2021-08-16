package one.digitalinnovation.collections

fun main() {
    //val nomes = Array<String>(3) {" "}
    val nomes = Array(3) {" "}               // infere o tipo
    nomes[0] = "nome2"
    nomes[1] = "nome1"
    nomes[2] = "nome0"

    for (nome in nomes){
        println(nome)
    }
    println("----------")
    nomes.sort()
    for (nome in nomes){
        println(nome)
    }
    println("----------")
    nomes.forEach { println(it) }
    println("----------")
    val nomes2 = arrayOf("abc", "789", "456")
    nomes2.sort()
    nomes2.forEach { println(it) }
}
