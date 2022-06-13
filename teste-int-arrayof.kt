fun main() {

    // Passando valores diretamente no array \\

    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    // Colocando em ordem com sort() \\

    values.sort()

    // Exibindo com 'FOREACH' \\

    values.forEach {
        println(it)
    }

}