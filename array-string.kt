fun main() {

    // Cria o array tipo String
    // EX: val nomes = Array<String>(Tamanho) {""}
    // Ou o Exemplo Abaixo

    val nomes = Array(5) {""}

    // EXEMPLO 2: val nomes = arrayof("nome1", "nome2", "nome3")

    // INSERINDO VALORES AO ARRAY

    nomes[0] = "Aria"
    nomes[1] = "Bose"
    nomes[2] = "Cucas"
    nomes[3] = "Dodrigo"
    nomes[4] = "Esa"

    // ORDENA OS ARRAY

    nomes.sort()

    // EXIBE OS ARRAY linha por linha

    nomes.forEach {
        println(it)
    }

    

}