package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("joao", 1000.0)
    val map1 = mapOf(pair)
    map1.forEach{ (k, v) ->  println("chave: $k - valor: $v") }
    println("----------")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "maria" to 3000.0
    )
    map2.forEach{ (k, v) ->  println("chave: $k - valor: $v") }
}