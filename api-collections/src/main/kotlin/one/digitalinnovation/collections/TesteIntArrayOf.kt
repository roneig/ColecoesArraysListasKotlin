package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(15, 9, 3, 4, 6)

    values.forEach {
        println(it)
    }
    println("--------------")
    values.sort()
    values.forEach {
        println(it)
    }

}