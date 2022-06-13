fun main(){

    // Criando Array do Tipo Int com 5 posições\\

    val values = IntArray(5)

    // Adicionando Valores as Posições \\

    values[0] = 1
    values[1] = 2
    values[2] = 5
    values[3] = 4
    values[4] = 3

    // sort() - Coloca os valores em ordem Crescente \\

    values.sort()

    // Visualizando Valores em ordem com o 'FOR' \\

    for(i in values){
        println(i)
    }

    // Visualizando Valores com o 'FOREACH' \\

    values.forEach {
        println(it)
    }
}
