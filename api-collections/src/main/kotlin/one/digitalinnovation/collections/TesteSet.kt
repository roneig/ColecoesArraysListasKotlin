package one.digitalinnovation.collections

fun main() {
    val  joao   = Funcionario("joao", 2000.0, "CLT" )
    val  pedro  = Funcionario("pedro", 1500.0, "PJ" )
    val  maria  = Funcionario("maria", 4000.0, "CLT" )

    val funcionarios1 = setOf(
        joao,
        pedro
    )
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println("união de conjuntos  \n   $it") }

    val funcionarios3 = setOf(
        joao,
        pedro,
        maria
    )
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println("Subtração de conjuntos  \n   $it") }

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println("Interseção de conjuntos  \n   $it") }


}