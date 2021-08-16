package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 4
    values[1] = 3
    values[2] = 2
    values[3] = 1
    values[4] = 0

    for ((index,value) in values.withIndex()) {
        println("$index   $value")
    }
    println("----------")
    values.forEach {
        println(it)
    }
    println("----------")
    values.forEach {value ->  println(value)}
    println("----------")
    for(index in values.indices) {
        println("$index   ${values[index]}  ")
    }
    println("----------")
    values.sort()
    for(value in values) {
        println(value)
    }

}