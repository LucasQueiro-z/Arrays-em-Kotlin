fun main() {

    val salarios = DoubleArray(3)

    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.00

    salarios.forEach {
        println(it)
    }

    println("*********************")

    salarios.forEachIndexed{
        index, salario -> salarios[index] = salario * 1.1
    }

    salarios.forEach {
        println(it)
    }

    println("---------------")

    val salarios2 = doubleArrayOf(1.0)

    salarios2.forEach {
        println(it)
    }

}