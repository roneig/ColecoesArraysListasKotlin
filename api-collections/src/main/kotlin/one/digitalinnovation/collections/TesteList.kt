package one.digitalinnovation.collections

fun main() {

    val  joao   = Funcionario("joao", 2000.0, "CLT" )
    val  pedro  = Funcionario("pedro", 1500.0, "PJ" )
    val  maria  = Funcionario("maria", 4000.0, "CLT" )

    // lista não mutável, depois dessa adição não é possível adicionar outro objeto
    // pode somente alterar os objetos adicionados
    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{ println(it) }

    println("imprime somente maria: \n ${funcionarios.find{ it.nome == "maria" }}")
    println("imprime somente josé: \n ${funcionarios.find{ it.nome == "jose" }}")
    println("----------")

    funcionarios
        .sortedBy { it.salario }
        .forEach{ println("salario ordenado \n $it ")}

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println("agrupados por tipo contatação \n $it ")}



}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            nome:    $nome
            salario: $salario
            tipo Contratação: $tipoContratacao
            -------------------------
        """.trimIndent()

}